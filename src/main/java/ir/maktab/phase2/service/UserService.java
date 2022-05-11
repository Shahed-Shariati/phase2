package ir.maktab.phase2.service;

import ir.maktab.phase2.model.User;
import ir.maktab.phase2.service.base.BaseService;

public interface UserService extends BaseService<User,Integer> {

    User login(String userName);
}
