package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
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
        Customer findCustomer = customerService.findById(customer.getId());
       assertNotNull(findCustomer);
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

    @Test
    void showOfferList(){
       List<Offer> offers = customerService.showOffer(1,"technician");
       offers.forEach(System.out::println);
       //assertEquals();
    }
}