package com.meng.dao.impl;

import com.meng.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    @Value("${name}")//简单类型注入
    private String name;

    @Override
    public void save() {
        System.out.println("book dao save ..."+name);
    }
}
