package ir.maktab.phase2.model;

import ir.maktab.phase2.model.base.BaseEntity;
import ir.maktab.phase2.model.enumeration.OrderStatus;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;




@Entity
@Table(name = "orders")

public class Order extends BaseEntity<Integer> {

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "customer_id")
    private Customer customer;

  @ManyToOne(cascade = CascadeType.MERGE)
  @JoinColumn(name = "sub_service_id")
  private SubSpecialist subSpecialist;

   @Temporal(TemporalType.DATE)
   private Date date;

   private String description;



   @Enumerated(EnumType.STRING)
   private OrderStatus orderStatus;

   private Double suggestPrice;

   private String address;

    public Order(Integer integer, Customer customer, SubSpecialist subSpecialist, Date date, String description, OrderStatus orderStatus, Double suggestPrice, String address) {
        super(integer);
        this.customer = customer;
        this.subSpecialist = subSpecialist;
        this.date = date;
        this.description = description;
        this.orderStatus = orderStatus;
        this.suggestPrice = suggestPrice;
        this.address = address;
    }

    public Order() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public SubSpecialist getSubSpecialist() {
        return subSpecialist;
    }

    public void setSubSpecialist(SubSpecialist subSpecialist) {
        this.subSpecialist = subSpecialist;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getSuggestPrice() {
        return suggestPrice;
    }

    public void setSuggestPrice(Double suggestPrice) {
        this.suggestPrice = suggestPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", subSpecialist=" + subSpecialist +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", offers=" +
                ", orderStatus=" + orderStatus +
                ", suggestPrice=" + suggestPrice +
                ", address='" + address + '\'' +
                '}';
    }
}
