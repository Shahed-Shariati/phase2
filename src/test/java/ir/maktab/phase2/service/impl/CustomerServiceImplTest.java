package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Customer;
import ir.maktab.phase2.model.Role;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CustomerServiceImplTest {
    @Autowired
private CustomerServiceImpl customerService;
    private Customer customer;
    @BeforeEach
    void initial()
    {
        Role role = new Role(2,"customer");
        customer = new Customer();
        customer.setEmail("sh1");
        customer.setFirstName("ako");
        customer.setLastName("Faraji");
        customer.setRole(role);
    }



    @Test
    void save(){
     customerService.save(customer);

     assertEquals(1,customer.getId());
    }


    
}