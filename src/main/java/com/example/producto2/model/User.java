package com.example.producto2.model;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public User(String name) {
        this.setName(name);
        this.setId((long) (Math.random() * (1000 - 1) + 1));
    }

    public User() {
        this.setId((long) (Math.random() * (1000 - 1) + 1));
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
