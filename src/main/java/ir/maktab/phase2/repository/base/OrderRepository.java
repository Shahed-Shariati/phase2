package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
