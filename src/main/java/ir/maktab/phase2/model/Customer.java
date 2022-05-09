package ir.maktab.phase2.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Inheritance(strategy = InheritanceType.JOINED)
public class Customer extends User {
@OneToOne
private Wallet wallet;

    public Customer(Integer integer, String firstName, String lastName, String email, String passWord, Role role, LocalDateTime creationTime, Wallet wallet) {
        super(integer, firstName, lastName, email, passWord, role, creationTime);
        this.wallet = wallet;
    }

    public Customer() {
    }
}
