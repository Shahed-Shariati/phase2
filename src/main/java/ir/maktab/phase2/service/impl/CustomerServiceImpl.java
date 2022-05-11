package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Customer;
import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.model.enumeration.OrderStatus;
import ir.maktab.phase2.repository.base.CustomerRepository;
import ir.maktab.phase2.service.CustomerService;
import ir.maktab.phase2.service.OrderService;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<CustomerRepository, Customer,Integer> implements CustomerService {
    @Autowired
    private OrderService orderService;

    public CustomerServiceImpl(CustomerRepository repository) {
        super(repository);
    }

    @Override
    public Order orderSave(Order order,Customer customer) {
         order.setCustomer(customer);
         order.setOrderStatus(OrderStatus.waitingExpertSelection);
         orderService.save(order);
         return order;
    }
}
