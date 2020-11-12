package com.example.demo.factory;

import com.example.demo.service.AccountService;
import com.example.demo.service.impl.AccountServiceImpl;

public class StaticFactory {

    public static AccountService getInstanceFactory() {
        return new AccountServiceImpl("ss");
    }
}
