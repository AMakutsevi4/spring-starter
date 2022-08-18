package ru.spring.database.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.spring.bpp.Auditing;
import ru.spring.bpp.InjectBean;
import ru.spring.bpp.Transaction;
import ru.spring.database.pool.ConnectionPool;
import ru.spring.entity.Company;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Transaction
@Auditing
public class CompanyRepository implements CrudRepository<Integer, Company> {

    /* @Qualifier("pool1") */
    ConnectionPool connectionPool;
    @Autowired
    List<ConnectionPool> pools;

    @PostConstruct
    private void init() {
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method...");
    }
}
