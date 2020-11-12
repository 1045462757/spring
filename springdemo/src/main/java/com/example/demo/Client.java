package com.example.demo;

import com.example.demo.factory.BeanFactory;
import com.example.demo.service.AccountService;

/**
 * 工厂模式
 */
public class Client {

    public static void main(String[] args) {
//        AccountService accountService = new AccountServiceImpl();
        AccountService accountService = (AccountService) BeanFactory.getBean("accountService");
        accountService.saveAccount();
    }
}
