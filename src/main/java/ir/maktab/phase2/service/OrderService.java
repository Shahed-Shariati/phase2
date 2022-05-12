package ir.maktab.phase2.service;

import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.model.SubSpecialist;
import ir.maktab.phase2.model.enumeration.OrderStatus;
import ir.maktab.phase2.service.base.BaseService;

import java.util.List;

public interface OrderService extends BaseService<Order,Integer> {
    List<Order> findBySubSpecialistIn(List<SubSpecialist> subSpecialists);
    Integer upDateOrderStatus(OrderStatus status, Integer id);
}
