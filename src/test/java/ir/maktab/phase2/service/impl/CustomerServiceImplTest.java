package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Customer;
import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.model.Role;
import ir.maktab.phase2.model.SubSpecialist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

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
        customer.setId(1);

    }



    @Test
    void save(){
        Role role = new Role(2,"customer");
        customer = new Customer();
        customer.setEmail("sh1");
        customer.setFirstName("ako");
        customer.setLastName("Faraji");
        customer.setRole(role);

     customerService.save(customer);

     assertEquals(1,customer.getId());
    }


    @Test
    void orderSave() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String dateInString = "7-Jun-2013";

        Order order = new Order();
        SubSpecialist subSpecialist = new SubSpecialist();
        subSpecialist.setId(1);
        order.setAddress("teh");
        order.setCustomer(customer);
        order.setSuggestPrice(45d);
        order.setDescription("description");
        order.setDate(formatter.parse(dateInString));
        order.setSubSpecialist(subSpecialist);

        customerService.orderSave(order,customer);

        assertEquals(1,order.getId());

    }
}