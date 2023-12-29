package java.demo.com.PicPay.services.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.demo.com.PicPay.domain.dtos.TransactionDTO;
import java.demo.com.PicPay.domain.transaction.Transaction;
import java.demo.com.PicPay.domain.users.User;
import java.demo.com.PicPay.repositories.TransactionRepository;
import java.demo.com.PicPay.services.TransactionService;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final UserServiceImpl userService;
    private final TransactionRepository repository;
    private final RestTemplate restTemplate;

    @Value("$mock.url")
    private String mockUrl;


    @Override
    public void createTransaction(TransactionDTO transactionDTO) throws Exception {
        User payer = this.userService.findByIdOrThrowBadRequestException(transactionDTO.payerId());
        User payee = this.userService.findByIdOrThrowBadRequestException(transactionDTO.payeeId());

        this.userService.validateTransaction(payer, transactionDTO.value());

        boolean isAuthorized = this.authorizeTransaction(payer, transactionDTO.value());
        if (!isAuthorized) throw new Exception("Unauthorized transaction");

        Transaction transaction = new Transaction();
        transaction.setAmount(transactionDTO.value());
        transaction.setPayer(payer);
        transaction.setPayee(payee);
        transaction.setTimestamp(LocalDateTime.now());

        payer.setBalance(payer.getBalance().subtract(transactionDTO.value()));
        payee.setBalance(payee.getBalance().add(transactionDTO.value()));

        this.repository.save(transaction);
        this.userService.saveUser(payer);
        this.userService.saveUser(payee);
    }

    @Override
    public boolean authorizeTransaction(User sender, BigDecimal amount) {
        ResponseEntity<Map<String, Object>> authorizationResponse =
                restTemplate.exchange(mockUrl, HttpMethod.GET, null, new ParameterizedTypeReference<Map<String, Object>>() {
                });

        if (authorizationResponse.getStatusCode() == HttpStatus.OK) {
            Map<String, Object> responseBody = authorizationResponse.getBody();

            if (responseBody != null && responseBody.containsKey("message")) {
                String message = (String) responseBody.get("message");
                return "Authorized".equalsIgnoreCase(message);
            }
        }
        return false;
    }
}
