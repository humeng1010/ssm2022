package com.meng.service.impl;

import com.meng.dao.BookDao;
import com.meng.service.BookService;

public class BookServiceImpl implements BookService {
    //解耦合
//    private BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;

    //提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        bookDao.save();
        System.out.println("Book Service running ...");
    }
}
