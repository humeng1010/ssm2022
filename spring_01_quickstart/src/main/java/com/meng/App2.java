package com.meng;

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
        //NoSuchBeanDefinitionException 如果出现了这个报错就是没有这个bean，我们就检查bean的名称是否一致
        bookService.save();
    }
}
