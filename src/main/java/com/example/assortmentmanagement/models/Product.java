package com.example.assortmentmanagement.models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {
    @Id
    @GeneratedValue
    protected long id;
    protected String name;
    protected int serialNum;
    protected String manufacturer;
    protected int number;

    public Product() {
    }

    public Product(String name, int serialNum, String manufacturer, int number) {
        this.name = name;
        this.serialNum = serialNum;
        this.manufacturer = manufacturer;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serialNum=" + serialNum +
                ", manufacturer='" + manufacturer + '\'' +
                ", number=" + number +
                '}';
    }
}
