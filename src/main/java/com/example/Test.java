package com.example;

import com.example.domain.User;
import com.example.ioc.BeanFactory;
import com.example.ioc.ClassPathXmlApplicationContext;
import com.example.service.UserService;

public class Test {
    public static void main(String[] args) throws Exception {
        BeanFactory factory = new ClassPathXmlApplicationContext();
        //通过工厂直接获取
        UserService userService = (UserService) factory.getBean("userService");
        //其实User也可以从工厂中获得
        User u = (User) factory.getBean("user");
        //User u = new User();
        u.setUserName("tom");
        u.setPassword("123456");
        userService.addUser(u);//打印结果tom123456
    }
}
