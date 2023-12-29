package java.demo.com.PicPay.domain.transaction;

import jakarta.persistence.*;
import lombok.*;

import java.demo.com.PicPay.domain.users.User;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;
    @ManyToOne
    @JoinColumn(name = "payer_id", referencedColumnName = "id")
    private User payer;
    @ManyToOne
    @JoinColumn(name = "payee_id", referencedColumnName = "id")
    private User payee;
    private LocalDateTime timestamp;
}
