package ir.maktab.phase2.model;

import ir.maktab.phase2.model.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity

public class SubService extends BaseEntity<Integer> {
    @Column(columnDefinition = "varchar(100)")
    private String name;
    @ManyToOne()
    private Service parentService;

    private Double basePrice;

    public SubService(Integer integer, String name, Service parentService, Double basePrice) {
        super(integer);
        this.name = name;
        this.parentService = parentService;
        this.basePrice = basePrice;
    }

    public SubService() {
    }
}
