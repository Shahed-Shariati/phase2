package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Specialist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SpecialistServiceImplTest {
    @Autowired
    private SpecialistServiceImpl specialistService;
    private Specialist specialist;
   @BeforeEach
    void initial(){
        specialist = new Specialist();
        specialist.setName("Meckanic");
    }

    @Test
    void save(){

       specialistService.save(specialist);

       assertEquals(1,specialist.getId());

    }
}