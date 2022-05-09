package ir.maktab.phase2.model;

import ir.maktab.phase2.model.base.BaseEntity;
import org.hibernate.annotations.CreationTimestamp;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends BaseEntity<Integer> {
    @Column(columnDefinition = "varchar(100)")
    private String firstName;
    @Column(columnDefinition = "varchar(150)")
    private String lastName;
    @Column(unique = true)
    private String email;
    private String passWord;

    @ManyToOne
    private Role role;

    @CreationTimestamp
    private LocalDateTime creationTime;

    public User(Integer integer, String firstName, String lastName, String email, String passWord, Role role, LocalDateTime creationTime) {
        super(integer);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passWord = passWord;
        this.role = role;
        this.creationTime = creationTime;
    }

    public User() {
    }
}
