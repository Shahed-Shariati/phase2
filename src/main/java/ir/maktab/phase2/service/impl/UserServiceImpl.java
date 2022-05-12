package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Person;
import ir.maktab.phase2.repository.base.UserRepository;
import ir.maktab.phase2.service.UserService;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl  extends BaseServiceImpl<UserRepository,Person,Integer> implements UserService {


    public UserServiceImpl(UserRepository userRepository) {
        super(userRepository);
    }

    @Override
    public Person login(String firstName) {
        return null;
    }


    @Override
    @Transactional
    public void upDate(String email, Integer id) {

    }
}
