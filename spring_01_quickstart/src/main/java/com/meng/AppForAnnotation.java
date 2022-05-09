package com.meng;

import com.meng.config.SpringConfig;
import com.meng.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        bookDao.save();

        applicationContext.close();
    }
}
