package com.example.assortmentmanagement.ProductProperties;

public enum ComputerFormFactor {
    DESKTOP ("Десктоп"),
    NETTOP ("Неттоп"),
    MONOBLOCK("Моноблок");

    private final String formFactorName;

    ComputerFormFactor (String formFactorName) {
        this.formFactorName = formFactorName;
    }

    @Override
    public String toString() {
        return formFactorName;
    }
}
