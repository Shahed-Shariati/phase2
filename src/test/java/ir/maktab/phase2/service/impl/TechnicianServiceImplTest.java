package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Customer;
import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.model.Role;
import ir.maktab.phase2.model.Technician;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TechnicianServiceImplTest {
    @Autowired
    private TechnicianServiceImpl technicianService;
    private Technician technician;


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

      //  assertEquals(1, technician.getId());
    }
    @Test
    void showTechnicianSubService(){

        Technician technician1 = technicianService.findById(4);

        List<Order> orders = technicianService.showOrderByTechnicianSubSpecialist(technician1.getSubSpecialists());
        orders.forEach(System.out::println);
        assertEquals(2,orders.size());

    }
}