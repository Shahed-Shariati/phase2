package ir.maktab.phase2.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "user_id")
@Inheritance(strategy = InheritanceType.JOINED)
public class Customer extends Person {
@OneToOne
private Wallet wallet;

@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
private Set<Order> orders;


    public Customer(Integer integer, String firstName, String lastName, String email, String passWord, Role role, LocalDateTime creationTime, Wallet wallet) {
        super(integer, firstName, lastName, email, passWord, role, creationTime);
        this.wallet = wallet;
    }

    public Customer() {

    }
}
