package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.exception.OldPasswordNotValid;
import ir.maktab.phase2.model.Customer;
import ir.maktab.phase2.model.Offer;
import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.model.enumeration.OrderStatus;
import ir.maktab.phase2.repository.base.CustomerRepository;
import ir.maktab.phase2.service.CustomerService;
import ir.maktab.phase2.service.OfferService;
import ir.maktab.phase2.service.OrderService;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<CustomerRepository, Customer,Integer> implements CustomerService {

    private OrderService orderService;
    private CustomerRepository customerRepository;
    private OfferService offerService;

    public CustomerServiceImpl(CustomerRepository repository, OrderService orderService,OfferService offerService) {
        super(repository);
        this.orderService = orderService;
        this.customerRepository = repository;
        this.offerService = offerService;
    }

    @Override
    @Transactional
    public Order orderSave(Order order,Customer customer) {
         order.setCustomer(customer);
         order.setOrderStatus(OrderStatus.waitingTechnicianSelection);
         orderService.save(order);
         return order;
    }

    @Override
    public List<Offer> showOffer(Integer id, String sort) {
        if (sort.equals("technician"))
            return offerService.findOfferSortByTechnician(id);
        if(sort.equals("suggestPrice"))
            return offerService.findOfferSortByPrice(id);
        return null;
    }

    @Override
    @Transactional
    public void selectOffer(Offer offer) {
      Order order = offer.getOrder();
      orderService.upDateOrderStatus(OrderStatus.waitingTechnicianComing,order.getId());
    }

    @Override
    public List<Order> showCustomerOrders(Integer id) {
        return orderService.findByCustomerId(id);
    }

    @Override
    public void changePassword(String newPassword,String oldPassword,Customer customer) {
        if(customer.getPassWord().equals(oldPassword)) {
            repository.upDatePassword(newPassword, customer.getId());
        }else {
            throw new OldPasswordNotValid();
        }
    }


}
