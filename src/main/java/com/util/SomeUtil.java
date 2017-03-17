package com.util;

import com.bean.User;
import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yuyu on 2016/10/26.
 */

@Component("someUtil")
public class SomeUtil {

    @Autowired
    private UserDao userDao;

    public String getxxxxx(){
        User user = userDao.getUserByName("yuyu");
        String name = user.getName();
        return name;
    }



}
