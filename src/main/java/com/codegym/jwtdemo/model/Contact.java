package com.codegym.jwtdemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Contact {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String title;

    public Contact() {
    }

    public Contact(String name, String title) {
        this.name = name;
        this.title = title;
    }
}
