package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Customer;
import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.model.enumeration.OrderStatus;
import ir.maktab.phase2.repository.base.CustomerRepository;
import ir.maktab.phase2.service.CustomerService;
import ir.maktab.phase2.service.OrderService;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<CustomerRepository, Customer,Integer> implements CustomerService {

    private OrderService orderService;
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository repository, OrderService orderService) {
        super(repository);
        this.orderService = orderService;
        this.customerRepository = repository;
    }

    @Override
    @Transactional
    public Order orderSave(Order order,Customer customer) {
         order.setCustomer(customer);
         order.setOrderStatus(OrderStatus.waitingExpertSelection);
         orderService.save(order);
         return order;
    }
}
