package com.example.demo.factory;

import com.example.demo.service.AccountService;
import com.example.demo.service.impl.AccountServiceImpl;

public class BeanFactory {

    public AccountService getInstanceFactory() {
        return new AccountServiceImpl("ss");
    }
}
