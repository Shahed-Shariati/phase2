package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Customer;
import ir.maktab.phase2.repository.base.CustomerRepository;
import ir.maktab.phase2.service.CustomerService;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<CustomerRepository, Customer,Integer> implements CustomerService {
    public CustomerServiceImpl(CustomerRepository repository) {
        super(repository);
    }

}
