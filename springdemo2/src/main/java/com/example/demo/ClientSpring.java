package com.example.demo;

import com.example.demo.dao.AccountDao;
import com.example.demo.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring
 */
public class ClientSpring {

    /**
     * 获取spring的核心容器，并根据id获取对象
     *
     * ApplicationContext的三个常用实现类
     *      ClassPathXmlApplicationContext
     *      FileSystemXmlApplicationContext
     *      AnnotationConfigApplicationContext
     *
     * 核心容器接口引发出的问题
     * ApplicationContext:
     *      它在构建核心容器时，创建对象的策略是采用立即加载的方式，只要已读取完配置文件就马上创建对象
     * BeanFactory:
     *      它在构建核心容器时，创建对象的策略是采用延迟加载的方式，什么时候根据id获取对象才真正创建对象
     *
     * @param args
     */
    public static void main(String[] args) {

        //获取核心容器对象
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        //根据id获取对象
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");

//        System.out.println(accountService);
        accountService.saveAccount();
        applicationContext.close();
    }
}
