package com.meng;

import com.meng.dao.BookDao;
import com.meng.service.BookService;
import com.meng.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
//        BookService bookService = new BookServiceImpl();
//        bookService.save();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
//        System.out.println(dataSource);
        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        bookDao.save();
    }
}
