package com.example.assortmentmanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "productId")
public class Screen extends Product{
    private int screenSize;

    public Screen() {
        this.screenSize = 0;
    }

    public Screen(String name, int serialNum, String manufacturer, int number, int screenSize) {
        super(name, serialNum, manufacturer, number);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "screenSize=" + screenSize +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", serialNum=" + serialNum +
                ", manufacturer='" + manufacturer + '\'' +
                ", number=" + number +
                '}';
    }
}
