package ru.spring.database.repository;

import lombok.Value;
import ru.spring.bpp.InjectBean;
import ru.spring.database.pool.ConnectionPool;

@Value
public class CompanyRepository {

    @InjectBean
    ConnectionPool connectionPool;

}
