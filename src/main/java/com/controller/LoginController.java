package com.controller;

import com.bean.User;
import com.service.UserService;
import com.tett.LogTest;
import com.util.SomeUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

/**
 * Created by yuyu on 2016/10/19.
 */

@Controller
public class LoginController {
    Logger logger = Logger.getLogger(LoginController.class);
    @Value("jdbc.driver")
    private String testInjectStr;


    //这个地方的自动注入是按 名称匹配的方式注入的，变量名与Service("xxxxxx")标签上的xxxxxx相匹配的
    //    @Autowired默认按类型装配，默认情况下必须要求依赖对象必须存在，如果要允许null值，可以设置它的required属性为false，
    //    例如：@Autowired(required=false) ，如果我们想使用名称装配可以结合@Qualifier注解进行使用，如下：
    //    @Autowired(required = true) 默认为true
    //    @Qualifier("baseDao")
    //    private BaseDao baseDao;

    //    @Resource，默认安装名称进行装配，名称可以通过name属性进行指定，如果没有指定name属性，当注解写在字段上时，默认取字段名进行安装名称查找，如果注解写在setter方法上默认取属性名进行装配。当找不到与名称匹配的bean时才按照类型进行装配。但是需要注意的是，如果name属性一旦指定，就只会按照名称进行装配。
    //    @Resource(name="baseDao")
    //    private BaseDao baseDao;

    //    @Autowired和@Resource都可以用来装配bean，都可以写在字段上，或者方法上。
    @Autowired(required = true)
    private UserService userService1;
    @Autowired
    private SomeUtil somutil;


    @RequestMapping("/login")
    @ResponseBody
    public User login(HttpServletRequest request, HttpServletRequest response, Model model) {

//        LogTest logTest = new LogTest();
//        logTest.start();

        User user = userService1.getUserByName("yuyu");
        user.setId(1L);
        user.setName("长孙娜");
        user.setPassword("32434天天");

        String xxooxxoo = somutil.getxxxxx();
        System.out.println(xxooxxoo);

        String name = request.getParameter("username");
        String password = request.getParameter("password");
        logger.error("test inject data" + testInjectStr);
//        User user = userService.getUserByName("yuyu");
        String xxx = "1212121";
        String xxx1 = "1212121";
        String xxx23 = "1212121";
        String xxx3 = "1212121";
        model.addAttribute("name", name);
        model.addAttribute("password", password);
        model.addAttribute("xxoo", testInjectStr);
        Thread t = new Thread();
        return user;
    }


}
