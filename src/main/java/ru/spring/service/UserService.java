package ru.spring.service;

import org.springframework.stereotype.Service;
import ru.spring.database.repository.CrudRepository;
import ru.spring.database.repository.UserRepository;
import ru.spring.dto.CompanyDto;
import ru.spring.entity.Company;

import java.util.Optional;

@Service
public class UserService {

    private final CrudRepository<Integer, Company> companyCrudRepository;
    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;


    public UserService(CrudRepository<Integer, Company> companyCrudRepository,
                       UserRepository userRepository, CrudRepository<Integer,
            Company> companyRepository) {
        this.companyCrudRepository = companyCrudRepository;
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }

    public Optional<CompanyDto> findById(Integer id){
        return companyRepository.findById(id).map(entity -> new CompanyDto(entity.id()));
    }
}
