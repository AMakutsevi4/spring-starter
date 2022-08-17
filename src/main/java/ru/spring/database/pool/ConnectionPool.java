package ru.spring.database.pool;

import lombok.Data;
import lombok.Value;

import java.util.List;
import java.util.Map;

@Data
@Value
public class ConnectionPool {
    String username;
    Integer poolSize;
    List<Object> args;
    Map<String, Object> properties;

    private void init() {
        System.out.println("Init connection pool");
    }

    private void destroy() {
        System.out.println("Clean connection pool");
    }
}
