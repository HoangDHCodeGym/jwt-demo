package com.codegym.jwtdemo;

import com.codegym.jwtdemo.model.Contact;
import com.codegym.jwtdemo.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(ContactService contactService) {
        return args -> {
            log.info("Preloading" + contactService.save(new Contact("Hoang", "Manager")));
            log.info("Preloading" + contactService.save(new Contact("Alpha", "Employee")));
        };
    }
}
