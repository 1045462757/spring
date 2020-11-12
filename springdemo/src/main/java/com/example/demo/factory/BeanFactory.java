package com.example.demo.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 工厂模式管理Bean
 */
public class BeanFactory {

    //定义一个Properties对象
    private static Properties properties;

    //定义一个Map用于存放我们创建的Bean对象，称之为容器
    private static Map<String, Object> beans;

    //使用静态代码块为Properties赋值
    static {
        try {
            properties = new Properties();
            InputStream inputStream = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            properties.load(inputStream);

            //实例化容器
            beans = new HashMap<>();

            //取出配置文件中的所有key
            Enumeration keys = properties.keys();

            //遍历枚举
            while (keys.hasMoreElements()) {
                //取出每个key
                String key = keys.nextElement().toString();

                //根据key获取value
                String beanPath = properties.getProperty(key);

                //反射创建对象
                Object value = Class.forName(beanPath).newInstance();

                //把key和value存入容器中
                beans.put(key, value);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化properties失败！");
        }
    }

    /**
     * 根据Bean的名称获取Bean对象
     */
    public static Object getBean(String beanName) {
//        Object bean = null;
//        try {
//            String beanPath = properties.getProperty(beanName);
//            bean = Class.forName(beanPath).newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return bean;

        return beans.get(beanName);
    }

}
