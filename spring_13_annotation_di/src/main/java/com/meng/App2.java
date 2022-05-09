package com.meng;

import com.meng.config.SpringConfig;
import com.meng.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class App2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//        BookService bookService = applicationContext.getBean(BookService.class);

//        bookService.save();
        DataSource dataSource = applicationContext.getBean(DataSource.class);

        System.out.println(dataSource);
    }
}
