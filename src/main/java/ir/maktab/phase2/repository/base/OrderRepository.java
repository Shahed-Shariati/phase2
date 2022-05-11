package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.model.SubSpecialist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {


    List<Order> findOrderBySubSpecialistIn(List<SubSpecialist> subSpecialists);


}
