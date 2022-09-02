package ru.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.spring.config.ApplicationConfiguration;
import ru.spring.database.pool.ConnectionPool;
import ru.spring.service.UserService;

public class ApplicationRunner {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
            context.getEnvironment().setActiveProfiles("web", "prod");
            context.refresh();
            System.out.println(context.getBean("pool1", ConnectionPool.class));
            var userService = context.getBean(UserService.class);
            System.out.println(userService.findById(1));
        }
    }
}
