package com.codegym.jwtdemo.repository;

import com.codegym.jwtdemo.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
