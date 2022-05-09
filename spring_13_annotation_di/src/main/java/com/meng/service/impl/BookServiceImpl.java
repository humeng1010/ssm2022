package com.meng.service.impl;

import com.meng.dao.BookDao;
import com.meng.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    //引用类型注入
    @Autowired//根据类型到容器中查找,如果有两个类型相同的，会根据下面的属性名bookDao，到容器中查找对应的bean的名称
//    @Qualifier("bookDao")//按照名称到容器中查找，很少按照名称(不能取掉上面的@Autowired)
    private BookDao bookDao;

//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();

    }
}
