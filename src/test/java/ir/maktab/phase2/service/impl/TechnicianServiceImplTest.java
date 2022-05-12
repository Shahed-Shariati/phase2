package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.exception.SuggestPriceUnderBasePrice;
import ir.maktab.phase2.model.*;
import ir.maktab.phase2.service.OrderService;
import ir.maktab.phase2.service.TechnicianService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TechnicianServiceImplTest {
    @Autowired
    private TechnicianService technicianService;
    private Technician technician;
    @Autowired
    private OrderService orderService;


    @Test
    void save(){
        File file = new File("C:\\Users\\Raha\\Pictures\\Saved Pictures\\typ1.png");
        byte[] image = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(image);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Role role = new Role(3,"technician");
        technician = new Technician();
        technician.setEmail("shahoo1");
        technician.setImage(image);
        technician.setFirstName("shahoo");
        technician.setLastName("shariati");
        technician.setRole(role);

        technicianService.save(technician);

      //  assertEquals(1, );
    }
    @Test
    void showTechnicianSubService(){

        Technician technician1 = technicianService.findById(4);

        List<Order> orders = technicianService.showOrderByTechnicianSubSpecialist(technician1.getSubSpecialists());
        orders.forEach(System.out::println);
        assertEquals(2,orders.size());

    }
    @Test
    void submitOffer() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String dateInString = "7-Jun-2022";
        Technician technician1 = technicianService.findById(3);
        Order order =  orderService.findById(2);
        System.out.println(order);
        Offer offer = new Offer();
        offer.setOrder(order);
        offer.setTechnician(technician1);
        offer.setDuration("4 day");
        offer.setStartTime(formatter.parse(dateInString));
        offer.setSuggestPrice(15000d);
        technicianService.submitOffer(offer);
        assertNotNull(offer.getId());



    }
}