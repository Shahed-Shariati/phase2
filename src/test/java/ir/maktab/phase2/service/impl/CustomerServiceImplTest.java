package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.*;
import ir.maktab.phase2.service.CustomerService;
import ir.maktab.phase2.service.OfferService;
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
    private CustomerService customerService;
    private Customer customer;
    @Autowired
    private OfferService offerService;

    @BeforeEach
    void initial()
    {

        customer = new Customer();
        customer.setEmail("sh1");
        customer.setFirstName("ako");
        customer.setLastName("Faraji");
        customer.setId(1);

    }



    @Test
    void save(){
        customerService.save(customer);
        Customer findCustomer = customerService.findById(customer.getId());
        assertNotNull(findCustomer);
    }


    @Test
    void orderSave() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String dateInString = "7-Jun-2022";
        Customer customer1 = customerService.findById(1);
        Order order = new Order();
        SubSpecialist subSpecialist = new SubSpecialist();
        subSpecialist.setId(1);
        order.setAddress("san");
        order.setCustomer(customer1);
        order.setSuggestPrice(45d);
        order.setDescription("description");
        order.setDate(formatter.parse(dateInString));
        order.setSubSpecialist(subSpecialist);
        customerService.orderSave(order,customer);

        assertNotNull(order.getId());

    }

    @Test
    void showOfferList(){
       List<Offer> offers = customerService.showOffer(1,"technician");
       offers.forEach(System.out::println);
       assertEquals(3,offers.size());
    }

    @Test
    void showOrderList(){
      List<Order> orders =  customerService.showCustomerOrders(1);

      assertNotNull(orders);
    }

    @Test
    void orderStatusUpDate(){
        Offer offer = offerService.findById(1);
        customerService.selectOffer(offer);
    }

    @Test
    void search(){
       List<Customer> customers = customerService.search("c",null,"sh1");

       assertEquals(1 ,customers.size());
    }
}