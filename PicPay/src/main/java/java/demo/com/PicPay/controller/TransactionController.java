package java.demo.com.PicPay.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.demo.com.PicPay.domain.dtos.TransactionDTO;
import java.demo.com.PicPay.domain.transaction.Transaction;
import java.demo.com.PicPay.services.TransactionService;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService service;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO transactionDTO) throws Exception {
        return new ResponseEntity<>(service.createTransaction(transactionDTO), HttpStatus.OK);
    }
}
