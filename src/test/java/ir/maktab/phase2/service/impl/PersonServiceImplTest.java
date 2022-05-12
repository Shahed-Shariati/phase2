package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Role;
import ir.maktab.phase2.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PersonServiceImplTest {
    @Autowired
    UserServiceImpl userService;
    Person person;
    @BeforeEach
    void initial()
    {
        Role role = new Role(2,"customer");

      /*  person = new Person();
        person.setEmail("sha");
        person.setFirstName("shahed");
        person.setPassWord("45697");
        person.setRole(role);*/
    }
    @Test
    void login() {

     //   userService.save(person);


        Person login = userService.login("sha");
        assertEquals("45697",login.getPassWord());
    }

    @Test
    void update(){
       /* Person person = new Person();
        person.setId(1);
        person.setEmail("ssssssssss");
        userService.upDate(person.getEmail(),person.getId());*/
    }
}