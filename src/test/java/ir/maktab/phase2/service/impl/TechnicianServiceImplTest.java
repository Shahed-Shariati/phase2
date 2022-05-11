package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Customer;
import ir.maktab.phase2.model.Role;
import ir.maktab.phase2.model.Technician;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TechnicianServiceImplTest {
    @Autowired
    private TechnicianServiceImpl technicianService;
    private Technician technician;


    @Test
    void save(){
        Role role = new Role(3,"technician");
        technician = new Technician();
        technician.setEmail("shahoo");
        technician.setFirstName("shahoo");
        technician.setLastName("shariati");
        technician.setRole(role);

        technicianService.save(technician);

        assertEquals(1, technician.getId());
    }
    @Test
    void showTechnicianSubService(){

        Technician technician1 = technicianService.findById(3);
        System.out.println(technician1);
    }
}