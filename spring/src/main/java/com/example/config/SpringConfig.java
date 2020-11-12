package com.example.config;

import org.springframework.context.annotation.*;

/**
 * 该类是一个配资类，和applicationContext.xml作用是一样的
 * ComponentScan
 * 指定创建容器时要扫描的包
 * <p>
 * Bean
 * 把当前方法的返回值作为Bean对象存入spring容器中
 * 属性: name 用于指定bean的id，默认为方法名
 * <p>
 * Import:导入其他配置类
 * PropertySource:指定Properties文件的位置
 */
@Configuration
@ComponentScan("com.example")
@Import({JdbcConfig.class,TransactionConfig.class})
@PropertySource("classpath:jdbcConfig.properties")
@EnableAspectJAutoProxy
public class SpringConfig {


}
