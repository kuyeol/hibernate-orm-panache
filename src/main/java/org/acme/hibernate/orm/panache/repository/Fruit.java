package org.acme.hibernate.orm.panache.repository;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@Cacheable
public class Fruit {

    @Id
    @GeneratedValue
    public Long id;

    @Column(length = 40, unique = true)
    public String name;
    public String password;

    public Fruit() {
    }

    public Fruit(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
