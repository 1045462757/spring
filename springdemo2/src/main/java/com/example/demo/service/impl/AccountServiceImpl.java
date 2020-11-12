package com.example.demo.service.impl;

import com.example.demo.service.AccountService;

public class AccountServiceImpl implements AccountService {


    private String name;

    public AccountServiceImpl() {
        System.out.println("对象创建了");
    }

    public AccountServiceImpl(String name) {
        this.name = name;
        System.out.println("对象创建了");
    }

    public void saveAccount() {
        System.out.println("service调用了saveAccount方法:name=" + name);
    }

    public void init() {
        System.out.println("对象初始化了");
    }

    public void destroy() {
        System.out.println("对象销毁了");
    }
}
