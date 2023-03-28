package com.example.assortmentmanagement.models;

import com.example.assortmentmanagement.ProductProperties.ComputerFormFactor;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Computer extends Product{

    private ComputerFormFactor computerFormFactor;

    public Computer() {

    }

    public Computer(String name, int serialNum, String manufacturer, int number, ComputerFormFactor computerType) {
        super(name, serialNum, manufacturer, number);
        this.computerFormFactor = computerType;
    }

    public ComputerFormFactor getComputerFormFactor() {
        return computerFormFactor;
    }

    public void setComputerFormFactor(ComputerFormFactor computerFormFactor) {
        this.computerFormFactor = computerFormFactor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerFormFactor=" + computerFormFactor +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", serialNum=" + serialNum +
                ", manufacturer='" + manufacturer + '\'' +
                ", number=" + number +
                '}';
    }
}
