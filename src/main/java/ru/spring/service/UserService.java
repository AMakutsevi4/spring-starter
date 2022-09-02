package ru.spring.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import ru.spring.database.repository.CrudRepository;
import ru.spring.database.repository.UserRepository;
import ru.spring.dto.CompanyDto;
import ru.spring.entity.Company;
import ru.spring.listener.entity.AccessType;
import ru.spring.listener.entity.EntityEvent;

import java.util.Optional;

@Service
public class UserService {

    private final CrudRepository<Integer, Company> companyCrudRepository;
    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;
    private final ApplicationEventPublisher eventPublisher;


    public UserService(CrudRepository<Integer, Company> companyCrudRepository,
                       UserRepository userRepository,
                       CrudRepository<Integer,
                               Company> companyRepository,
                       ApplicationEventPublisher eventPublisher) {
        this.companyCrudRepository = companyCrudRepository;
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
        this.eventPublisher = eventPublisher;
    }

    public Optional<CompanyDto> findById(Integer id) {
        return companyRepository.findById(id)
                .map(entity -> {
            eventPublisher.publishEvent(new EntityEvent(entity, AccessType.READ));
           return new CompanyDto(entity.id());
        });
    }
}
