package com.meng.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.meng.service.BookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
public class JdbcConfig {
    //第三方bean注入资源
    // 1.简单类型：@Value
    // 2.引用类型：直接定义为形参，spring就会根据类型自动装配对象
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    //1.定义一个方法获得要管理的对象
    //2.添加@Bean，表示当前方法的返回值是一个bean
    @Bean//名称一般不添加，我们按照类型查找：DataSource.class
    public DataSource dateSource(BookService bookService){
        System.out.println(bookService);
        bookService.save();
        DruidDataSource dataSource = new DruidDataSource();
        //jdbc.driver=com.mysql.cj.jdbc.Driver
        //jdbc.url=jdbc:mysql://localhost:3306/spring_db
        //jdbc.username=root
        //jdbc.password=12345678
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
