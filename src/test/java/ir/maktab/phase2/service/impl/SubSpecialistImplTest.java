package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.SubSpecialist;
import ir.maktab.phase2.service.SubSpecialistService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SubSpecialistImplTest {
@Autowired
private SubSpecialistService specialistService;
    @Test
    void showSubSpecial() {
       List<SubSpecialist> subSpecialists = specialistService.showSubSpecial(1);

       assertNotNull(subSpecialists);
    }
}