package ir.maktab.phase2.model;



import ir.maktab.phase2.model.base.BaseEntity;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Offer extends BaseEntity<Integer> {

    private Double suggestPrice;

    private String duration;

    @ManyToOne
    private Technician technician;

    @OneToOne
    private Order order;

    @Temporal(TemporalType.DATE)
    private Date startTime;

    @CreationTimestamp
    private LocalDateTime submitOfferTime;

    public Offer(Integer integer, Double suggestPrice, String duration, Technician technician, Order order, Date startTime, LocalDateTime submitOfferTime) {
        super(integer);
        this.suggestPrice = suggestPrice;
        this.duration = duration;
        this.technician = technician;
        this.order = order;
        this.startTime = startTime;
        this.submitOfferTime = submitOfferTime;
    }

    public Offer() {
    }
}
