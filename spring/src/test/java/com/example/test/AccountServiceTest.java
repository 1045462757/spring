package com.example.test;

import com.example.config.SpringConfig;
import com.example.domain.Account;
import com.example.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用Junit单元测试，测试配置
 * 整合spring与Junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindAll() {
        //获取容器
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

//        AccountService accountService = (AccountService) applicationContext.getBean("accountService");

        //执行方法
        List<Account> accounts = accountService.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne() {
        Account account = accountService.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("黄六");
        account.setMoney(4000f);
        accountService.saveAccount(account);
    }

    @Test
    public void testUpdate() {
        Account account = new Account();
        account.setId(4);
        account.setName("测试");
        account.setMoney(9999f);
        accountService.updateAccount(account);
    }

    @Test
    public void testDelete() {
        accountService.deleteAccount(4);
    }

    @Test
    public void testTransfer() {
        accountService.transfer("张三", "李四", 200f);
    }

    @Test
    public void test() {
        int i = 312;
        System.out.println(i / 10);
    }


    @Test
    public void test1() {
        for (int i = 1; i < 101; i++) {
            if ((i % 3 == 0 && i % 5 != 0) || (i / 10 == 3 || i % 10 == 3)) {
                System.out.println("Fizz");
            } else if ((i % 3 != 0 && i % 5 == 0) || (i / 10 == 5 || i % 10 == 5)) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
