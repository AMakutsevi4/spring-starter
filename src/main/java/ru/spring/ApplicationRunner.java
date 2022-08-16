package ru.spring;

import ru.spring.database.pool.ConnectionPool;
import ru.spring.database.repository.CompanyRepository;
import ru.spring.database.repository.UserRepository;
import ru.spring.ioc.Container;
import ru.spring.service.UserService;

public class ApplicationRunner {

    public static void main(String[] args) {
        Container container = new Container();
//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        var companyRepository = new CompanyRepository(connectionPool);
//        var userService = new UserService(userRepository, companyRepository);

        var connectionPool = container.get(ConnectionPool.class);
        var userRepository = container.get(UserRepository.class);
        var companyRepository = container.get(CompanyRepository.class);
        var userService = container.get(UserService.class);
    }
}
