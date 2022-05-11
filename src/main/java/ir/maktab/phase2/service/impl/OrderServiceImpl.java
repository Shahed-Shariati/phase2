package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.repository.base.OrderRepository;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends BaseServiceImpl<OrderRepository, Order,Integer> {
    public OrderServiceImpl(OrderRepository repository) {
        super(repository);
    }
}
