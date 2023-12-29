package java.demo.com.PicPay.domain.users;

import jakarta.persistence.*;
import lombok.*;

import java.demo.com.PicPay.domain.dtos.UserDTO;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fistName;
    private String lastName;
    @Column(unique = true)
    private String document;
    @Column(unique = true)
    private String email;
    private String password;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private UserType userType;

    public User(UserDTO userDTO) {
        this.fistName = userDTO.firstName();
        this.lastName = userDTO.lastName();
        this.balance = userDTO.balance();
        this.userType = userDTO.userType();
        this.password = userDTO.password();
        this.email = userDTO.email();
        this.document = userDTO.document();
    }
}
