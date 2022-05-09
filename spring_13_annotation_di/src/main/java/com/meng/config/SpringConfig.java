package com.meng.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration//标记为配置类
@Import({JdbcConfig.class})//导入配置类
@ComponentScan("com.meng")//开启注解扫描包
@PropertySource({"classpath:jdbc.properties"})//加载外部properties文件
public class SpringConfig {



}
