package com.example.jdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * JdbcTemplate最基本用法
 */
public class JdbcTemplateDemo1 {

    public static void main(String[] args) {

        //设置数据源
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/eesy");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("614213");

        //1.创建jdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        jdbcTemplate.setDataSource(driverManagerDataSource);

        //2.执行操作
        jdbcTemplate.execute("insert into account(name,money) values ('黄一',5000)");
    }
}
