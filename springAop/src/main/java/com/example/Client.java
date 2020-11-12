package com.example;

import com.example.service.AccountService;
import com.example.utils.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        accountService.saveAccount();
//        accountService.updateAccount(1);
//        accountService.deleteAccount();
    }
}
