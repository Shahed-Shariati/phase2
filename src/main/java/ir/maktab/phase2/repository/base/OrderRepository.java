package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.model.SubSpecialist;
import ir.maktab.phase2.model.enumeration.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {


    List<Order> findOrderBySubSpecialistIn(List<SubSpecialist> subSpecialists);

    @Modifying
    @Query("update Order o set o.orderStatus = :status where o.id = :id ")
    Integer upDateOrderStatus(@Param("status") OrderStatus status, @Param("id") Integer id);

    List<Order> findByCustomer_Id(Integer id);
}
