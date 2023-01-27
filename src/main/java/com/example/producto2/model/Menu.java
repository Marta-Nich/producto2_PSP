package com.example.producto2.model;


import javax.persistence.*;

@Entity
@Table(name = "Menu")

public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String name;
    private double price;
    private String tipe;

    public Menu(String name, double price, String tipe) {
        this.setName(name);
        this.setPrice(price);
        this.setTipe(tipe);
    }

    public Menu() {

    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public Long getId() {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}