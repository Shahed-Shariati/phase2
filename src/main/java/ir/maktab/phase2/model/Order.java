package ir.maktab.phase2.model;

import ir.maktab.phase2.model.base.BaseEntity;
import ir.maktab.phase2.model.enumeration.OrderStatus;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;


@Data
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order extends BaseEntity<Integer> {
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

  @ManyToOne
  @JoinColumn(name = "sub_service_id")
  private SubSpecialist subSpecialist;

   @Temporal(TemporalType.DATE)
   private Date date;

   private String description;

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Offer> offers;

   @Enumerated(EnumType.STRING)
   private OrderStatus orderStatus;

   private Double suggestPrice;

   private String address;

    public Order(Integer integer, Customer customer, SubSpecialist subSpecialist, Date date, String description, Set<Offer> offers, OrderStatus orderStatus, Double basePrice, String address) {
        super(integer);
        this.customer = customer;
        this.subSpecialist = subSpecialist;
        this.date = date;
        this.description = description;
        this.offers = offers;
        this.orderStatus = orderStatus;
        this.suggestPrice = basePrice;
        this.address = address;
    }

    public Order() {
    }
}
