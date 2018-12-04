package com.codegym.jwtdemo.controller;

import com.codegym.jwtdemo.model.Contact;
import com.codegym.jwtdemo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {
    final
    ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contacts")
    List<Contact> all() {
        return contactService.findAll();
    }
}
