package ir.maktab.phase2.service;

import ir.maktab.phase2.model.Customer;
import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.service.base.BaseService;

public interface CustomerService extends BaseService<Customer,Integer> {
    Order orderSave(Order order,Customer customer);
}
