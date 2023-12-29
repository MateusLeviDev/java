package java.demo.com.PicPay.domain.dtos;

import java.demo.com.PicPay.domain.users.UserType;
import java.math.BigDecimal;

public record UserDTO(
        String firstName,
        String lastName,
        String document,
        String email,
        String password,
        BigDecimal balance,
        UserType userType) {}
