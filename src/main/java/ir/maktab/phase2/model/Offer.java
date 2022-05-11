package ir.maktab.phase2.model;



import ir.maktab.phase2.model.base.BaseEntity;
import lombok.Builder;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity

public class Offer extends BaseEntity<Integer> {

    private Double suggestPrice;

    private String duration;

    @ManyToOne(cascade = CascadeType.ALL)
    private Technician technician;

    @OneToOne(cascade = CascadeType.ALL)
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

    public Double getSuggestPrice() {
        return suggestPrice;
    }

    public void setSuggestPrice(Double suggestPrice) {
        this.suggestPrice = suggestPrice;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getSubmitOfferTime() {
        return submitOfferTime;
    }

    public void setSubmitOfferTime(LocalDateTime submitOfferTime) {

        this.submitOfferTime = submitOfferTime;
    }

    @Override
    public String toString() {
        return "Offer{" + getId() +
                "suggestPrice=" + suggestPrice +
                ", duration='" + duration + '\'' +
                ", technician=" + technician +
                ", order=" + order +
                ", startTime=" + startTime +
                ", submitOfferTime=" + submitOfferTime +
                '}';
    }
}
