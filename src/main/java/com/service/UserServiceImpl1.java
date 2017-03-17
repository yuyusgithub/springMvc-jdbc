package com.service;

import com.bean.User;
import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yuyu on 2016/10/19.
 */

@Service("userService1")
public class UserServiceImpl1 implements UserService{

    @Autowired
    private UserDao userDao;
    public User getUserByName(String userName) {
        return userDao.getUserByName(userName);
    }



}
