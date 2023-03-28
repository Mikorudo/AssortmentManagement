package com.example.assortmentmanagement.ProductProperties;

public enum LaptopSize {
    INCH13 ("13-и дюймовый"),
    INCH14 ("14-и дюймовый"),
    INCH15 ("15-и дюймовый"),
    INCH17 ("17-и дюймовый");

    private final String sizeName;

    LaptopSize(String sizeName) {
        this.sizeName = sizeName;
    }
    @Override
    public String toString() {
        return sizeName;
    }
}
