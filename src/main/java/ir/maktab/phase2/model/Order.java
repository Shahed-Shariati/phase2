package ir.maktab.phase2.model;

import ir.maktab.phase2.model.base.BaseEntity;
import ir.maktab.phase2.model.enumeration.OrderStatus;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
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
  private SubService subService;

   @CreationTimestamp
   private LocalDateTime submitOrderTime;

   @Temporal(TemporalType.DATE)
   private Date date;

   private String description;



   @Enumerated(EnumType.STRING)
   private OrderStatus orderStatus;

   private String address;



}
