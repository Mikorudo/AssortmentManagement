package com.example.assortmentmanagement.service;

import com.example.assortmentmanagement.models.*;

import java.util.List;

public interface ProductService {
    Computer createComputer(Computer computer);
    HardDrive createHardDrive(HardDrive hardDrive);
    Laptop createLaptop(Laptop laptop);
    Screen createScreen(Screen screen);

    Computer updateComputer(long id, Computer computer);
    HardDrive updateHardDrive(long id, HardDrive hardDrive);
    Laptop updateLaptop(long id, Laptop laptop);
    Screen updateScreen(long id, Screen screen);

    List<Computer> getAllComputers();
    List<HardDrive> getAllHardDrives();
    List<Laptop> getAllLaptops();
    List<Screen> getAllScreens();
    List<Product> getAllProducts();
    Product getProductByID(long id);

    void deleteProduct(long id);
}
