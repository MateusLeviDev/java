package java.demo.com.PicPay.services.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.demo.com.PicPay.domain.dtos.UserDTO;
import java.demo.com.PicPay.domain.users.User;
import java.demo.com.PicPay.domain.users.UserType;
import java.demo.com.PicPay.repositories.UserRepository;
import java.demo.com.PicPay.services.UserService;
import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if (sender.getUserType() == UserType.SHOPKEEPER)
            throw new Exception("Unauthorized transaction for this type of user.");

        if (sender.getBalance().compareTo(amount) < 0)
            throw new Exception("Insufficient balance. Please make sure you have sufficient funds in your account.");
    }

    @Override
    public void saveUser(User user) {
        this.repository.save(user);
    }

    @Override
    public User createUser(UserDTO userDTO) {
        User user = new User(userDTO);
        this.saveUser(user);
        return user;
    }

    @Override
    public User findByIdOrThrowBadRequestException(Long id) {
        return this.repository.findById(id).orElseThrow(() -> new RuntimeException("User not found."));
    }

    @Override
    public List<User> getAllUsers() {
        return this.repository.findAll();
    }
}
