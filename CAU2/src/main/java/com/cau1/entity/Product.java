package com.cau1.entity;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long proId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    public Product() {
    }

    public Product(long proId, String name, double price) {
        this.proId = proId;
        this.name = name;
        this.price = price;
    }

    public long getProId() {
        return proId;
    }

    public void setProId(long proId) {
        this.proId = proId;
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
