package com.meng.dao.impl;

import com.meng.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book Dao running ... ");
    }
}
