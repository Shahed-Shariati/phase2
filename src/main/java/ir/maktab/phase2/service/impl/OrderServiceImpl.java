package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.model.SubSpecialist;
import ir.maktab.phase2.model.enumeration.OrderStatus;
import ir.maktab.phase2.repository.base.OrderRepository;
import ir.maktab.phase2.service.OrderService;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class OrderServiceImpl extends BaseServiceImpl<OrderRepository, Order,Integer> implements OrderService {
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository repository)
    {
        super(repository);
        this.orderRepository = repository;
    }


    @Override
    public List<Order> findBySubSpecialistIn(List<SubSpecialist> subSpecialists) {
        return orderRepository.findOrderBySubSpecialistIn(subSpecialists);
    }
}
