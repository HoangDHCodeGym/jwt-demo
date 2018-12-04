package com.codegym.jwtdemo.service;

import com.codegym.jwtdemo.model.Contact;
import com.codegym.jwtdemo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactRepository contactRepository;

    @Override
    public List<Contact> findAll() {
        return null;
    }

    @Override
    public Contact findOne(Long id) {
        return null;
    }

    @Override
    public Contact save(Contact contact) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
