package ir.maktab.phase2.service;

import ir.maktab.phase2.model.Offer;
import ir.maktab.phase2.model.Person;
import ir.maktab.phase2.service.base.BaseService;
import org.springframework.data.jpa.repository.Query;


public interface UserService  extends BaseService<Person,Integer> {


    Person login(String email);
    void upDate(String email, Integer id);
}
