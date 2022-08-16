package ru.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.spring.database.pool.ConnectionPool;

public class ApplicationRunner {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(context.getBean("pool2", ConnectionPool.class));
    }
    }
