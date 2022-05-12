package ir.maktab.phase2.service;

import ir.maktab.phase2.model.Customer;
import ir.maktab.phase2.model.Offer;
import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.service.base.BaseService;

import java.util.List;

public interface CustomerService extends BaseService<Customer,Integer> {
    Order orderSave(Order order,Customer customer);
    List<Offer> showOffer(Integer id , String sort);
    void selectOffer(Offer offer);
    List<Order> showCustomerOrders(Integer id);
    void changePassword(String newPassword,Integer customerId);

}
