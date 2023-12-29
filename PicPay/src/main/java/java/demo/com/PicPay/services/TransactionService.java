package java.demo.com.PicPay.services;

import java.demo.com.PicPay.domain.dtos.TransactionDTO;
import java.demo.com.PicPay.domain.users.User;
import java.math.BigDecimal;

public interface TransactionService {
    void createTransaction(TransactionDTO transactionDTO) throws Exception;
    boolean authorizeTransaction(User sender, BigDecimal amount);
}
