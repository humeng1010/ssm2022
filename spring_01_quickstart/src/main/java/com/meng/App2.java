package com.meng;

import com.meng.dao.BookDao;
import com.meng.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //获取IoC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
//        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");

        //调用
//        bookDao.save();
//        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        BookService bookService = (BookService) applicationContext.getBean("bookService");
        bookService.save();
    }
}
