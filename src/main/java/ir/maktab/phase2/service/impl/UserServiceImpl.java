package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.User;
import ir.maktab.phase2.repository.base.UserRepository;
import ir.maktab.phase2.service.UserService;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserRepository, User,Integer> implements UserService {


    public UserServiceImpl(UserRepository userRepository) {
        super(userRepository);

    }

    @Override
    public User login(String userName) {
        
        return repository.findByEmail(userName);
    }
}
