package ru.spring.database.pool;


import lombok.Data;
import lombok.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

@Data
@Value
public class ConnectionPool {
    String username;
    Integer poolSize;
    List<Object> args;
    Map<String, Object> properties;

    @PostConstruct
    private void init() {
        System.out.println("Init connection pool");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Clean connection pool");
    }
}
