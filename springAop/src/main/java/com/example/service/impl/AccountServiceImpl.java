package com.example.service.impl;

import com.example.service.AccountService;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    public void saveAccount() {
        System.out.println("执行了保存账户方法");
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新账户方法");
    }

    public int deleteAccount() {
        System.out.println("执行了删除账户方法");
        return 0;
    }
}
