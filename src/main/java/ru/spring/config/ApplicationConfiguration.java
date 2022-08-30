package ru.spring.config;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import ru.spring.database.repository.CrudRepository;
import org.springframework.stereotype.Component;
import ru.web.config.WebConfiguration;

/*@ImportResource("classpath:application.hml")*/
@Import(WebConfiguration.class)
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "ru.spring",
        useDefaultFilters = false,
        includeFilters = {
        @Filter(type = FilterType.ANNOTATION, value = Component.class),
        @Filter(type = FilterType.ASSIGNABLE_TYPE, value = CrudRepository.class),
        @Filter(type = FilterType.REGEX, pattern = "com\\..+Repository")
        })
public class ApplicationConfiguration {
}
