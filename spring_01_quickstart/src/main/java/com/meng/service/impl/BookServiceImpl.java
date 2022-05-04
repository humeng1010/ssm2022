package com.meng.service.impl;

import com.meng.dao.BookDao;
import com.meng.dao.impl.BookDaoImpl;
import com.meng.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao = new BookDaoImpl();
    @Override
    public void save() {
        bookDao.save();
        System.out.println("Book Service running ...");
    }
}
