package ir.maktab.phase2.model;

import ir.maktab.phase2.model.base.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity

public class SubSpecialist extends BaseEntity<Integer> {

    @Column(columnDefinition = "varchar(100)")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private Specialist parentSpecialist;

    private Double basePrice;

    public SubSpecialist(Integer integer, String name, Specialist parentSpecialist, Double basePrice) {
        super(integer);
        this.name = name;
        this.parentSpecialist = parentSpecialist;
        this.basePrice = basePrice;
    }

    public SubSpecialist() {
    }
}
