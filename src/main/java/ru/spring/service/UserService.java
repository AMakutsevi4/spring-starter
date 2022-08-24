package ru.spring.service;

import org.springframework.stereotype.Service;
import ru.spring.database.repository.CrudRepository;
import ru.spring.database.repository.UserRepository;
import ru.spring.entity.Company;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;


    public UserService(UserRepository userRepository, CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
