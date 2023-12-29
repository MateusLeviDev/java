package java.demo.com.PicPay.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.demo.com.PicPay.domain.dtos.UserDTO;
import java.demo.com.PicPay.domain.users.User;
import java.demo.com.PicPay.services.Impl.UserServiceImpl;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl service;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody UserDTO user) {
        return new ResponseEntity<>(service.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(this.service.getAllUsers());
    }
}
