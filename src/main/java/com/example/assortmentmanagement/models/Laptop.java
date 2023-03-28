package com.example.assortmentmanagement.models;

import com.example.assortmentmanagement.ProductProperties.LaptopSize;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Laptop extends Product{
    private LaptopSize laptopSize;

    public Laptop() {

    }

    public Laptop(String name, int serialNum, String manufacturer, int number, LaptopSize laptopSize) {
        super(name, serialNum, manufacturer, number);
        this.laptopSize = laptopSize;
    }

    public LaptopSize getLaptopSize() {
        return laptopSize;
    }

    public void setLaptopSize(LaptopSize laptopSize) {
        this.laptopSize = laptopSize;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopSize=" + laptopSize +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", serialNum=" + serialNum +
                ", manufacturer='" + manufacturer + '\'' +
                ", number=" + number +
                '}';
    }
}
