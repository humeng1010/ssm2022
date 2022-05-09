package com.meng;

import com.meng.config.SpringConfig;
import com.meng.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = applicationContext.getBean(BookService.class);

        bookService.save();
    }
}
