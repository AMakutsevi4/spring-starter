package ru.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.spring.database.pool.ConnectionPool;
import ru.spring.database.repository.CompanyRepository;

public class ApplicationRunner {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(context.getBean("pool1", ConnectionPool.class));
        CompanyRepository companyRepository = context.getBean("companyRepository", CompanyRepository.class);
        System.out.println(companyRepository);
    }
}
