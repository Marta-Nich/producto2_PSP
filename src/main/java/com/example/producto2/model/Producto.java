package com.example.producto2.model;

import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String descrip;
    private long price;

    public Producto(String name, String descrip,long price) {
        this.setName(name);
        this.setdescrip(descrip);
        this.setPrice(price);
    }

    public Producto(String name, long price) {
        this.setName(name);
        this.setPrice(price);

    }

    public Producto() {

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

    public String getDescrip() {
        return this.descrip;
    }

    public void setdescrip(String descrip) {
        this.descrip = descrip;
    }

    public long getPrice() {
        return this.price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

}
