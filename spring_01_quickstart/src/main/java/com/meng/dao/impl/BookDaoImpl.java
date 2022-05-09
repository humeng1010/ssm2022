package com.meng.dao.impl;

import com.meng.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("bookDao")
@Scope("singleton")
public class BookDaoImpl implements BookDao {

    @Value("ss")
    private String name;

    //spring使用无参构造方法进行bean的创建
    public BookDaoImpl() {
        System.out.println("BookDaoImpl construct is running ...");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("book Dao running ... "+name);
    }

    /**
     * 初始化方法
     */
    @PostConstruct
    public void init(){
        System.out.println("init...");
    }

    /**
     * 销毁方法
     */
    @PreDestroy
    public void destroy(){
        System.out.println("destroy...");
    }
}
