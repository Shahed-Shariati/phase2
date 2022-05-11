package ir.maktab.phase2.model;

import ir.maktab.phase2.model.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
public class Wallet extends BaseEntity<Integer> {
    private Double ballance;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Wallet(Integer integer, Double ballance, Customer customer) {
        super(integer);
        this.ballance = ballance;
        this.customer = customer;
    }

    public Wallet() {
    }
}
