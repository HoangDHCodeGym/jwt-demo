package com.codegym.jwtdemo.service;

import com.codegym.jwtdemo.model.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> findAll();
    Contact findOne(Long id);
    Contact save(Contact contact);
    void deleteById(Long id);
}
