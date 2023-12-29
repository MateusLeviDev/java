package java.demo.com.PicPay.services;

import java.demo.com.PicPay.domain.dtos.UserDTO;
import java.demo.com.PicPay.domain.users.User;
import java.math.BigDecimal;
import java.util.List;

public interface UserService {
    void validateTransaction(User sender, BigDecimal amount) throws Exception;
    void saveUser(User user);
    User createUser(UserDTO userDTO);
    User findByIdOrThrowBadRequestException(Long id);

    List<User> getAllUsers();
}
