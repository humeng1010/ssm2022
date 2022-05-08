package com.meng;

import com.meng.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao1 = applicationContext.getBean("bookDao", BookDao.class);
        BookDao bookDao2 = applicationContext.getBean("bookDao", BookDao.class);

        System.out.println(bookDao1);
        System.out.println(bookDao2);
        //地址相同，spring默认的bean是单例的,但是我们可以修改xml中bean的范围scope

        //为什么bean默认为单例？
        //对应spring来说，它管理的bean要放在spring容器中，
        // 如果它造出来的bean不是单例的，那么这个bean的数量会有无穷无尽个(用一次造一个，用一次造一个)
        //我们通过spring造一个dao对象执行一个方法，下一次我们就不用再造一个dao对象了，我们就可以直接去容器中获取对象执行方法

        //适合交给容器进行管理的bean：
        //- 表现层对象
        //- 业务层对象
        //- 数据层对象
        //- 工具对象
        //不适合交给容器进行管理的bean:
        //- 封装实体的域对象：pojo bean domain

    }
}
