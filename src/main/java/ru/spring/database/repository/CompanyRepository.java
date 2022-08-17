package ru.spring.database.repository;

import lombok.Value;
import ru.spring.database.pool.ConnectionPool;

@Value
public class CompanyRepository {

    ConnectionPool connectionPool;

    public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public static CompanyRepository of(ConnectionPool connectionPool) {
        return new CompanyRepository(connectionPool);
    }
}
