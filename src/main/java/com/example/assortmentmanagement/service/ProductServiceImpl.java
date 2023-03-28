package com.example.assortmentmanagement.service;

import com.example.assortmentmanagement.exception.ResourceNotFoundException;
import com.example.assortmentmanagement.models.*;
import com.example.assortmentmanagement.repository.AssortmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductServiceImpl implements ProductService  {
    @Autowired
    private AssortmentRepository assortmentRepository;
    @Override
    public Computer createComputer(Computer computer) {
        return assortmentRepository.save(computer);
    }

    @Override
    public HardDrive createHardDrive(HardDrive hardDrive) {
        return assortmentRepository.save(hardDrive);
    }

    @Override
    public Laptop createLaptop(Laptop laptop) {
        return assortmentRepository.save(laptop);
    }

    @Override
    public Screen createScreen(Screen screen) {
        return assortmentRepository.save(screen);
    }

    @Override
    public Computer updateComputer(long id, Computer computer) {
        List<Computer> computers = getAllComputers();
        Computer updatable = computers.stream().filter(obj -> obj.getId() == id).findFirst().orElse(null);
        if (updatable != null)
        {
            updatable.setComputerFormFactor(computer.getComputerFormFactor());
            updatable.setNumber(computer.getNumber());
            updatable.setSerialNum(computer.getSerialNum());
            updatable.setManufacturer(computer.getManufacturer());
            updatable.setName(computer.getName());
            return assortmentRepository.save(updatable);
        }
        else {
            throw new ResourceNotFoundException("Resource not found with id: " + id);
        }
    }

    @Override
    public HardDrive updateHardDrive(long id, HardDrive hardDrive) {
        List<HardDrive> hardDrives = getAllHardDrives();
        HardDrive updatable = hardDrives.stream().filter(obj -> obj.getId() == id).findFirst().orElse(null);
        if (updatable != null)
        {
            updatable.setDiskCapacity(hardDrive.getDiskCapacity());
            updatable.setNumber(hardDrive.getNumber());
            updatable.setSerialNum(hardDrive.getSerialNum());
            updatable.setManufacturer(hardDrive.getManufacturer());
            updatable.setName(hardDrive.getName());
            return assortmentRepository.save(updatable);
        }
        else {
            throw new ResourceNotFoundException("Resource not found with id: " + id);
        }    }

    @Override
    public Laptop updateLaptop(long id, Laptop laptop) {
        List<Laptop> laptops = getAllLaptops();
        Laptop updatable = laptops.stream().filter(obj -> obj.getId() == id).findFirst().orElse(null);
        if (updatable != null)
        {
            updatable.setLaptopSize(laptop.getLaptopSize());
            updatable.setNumber(laptop.getNumber());
            updatable.setSerialNum(laptop.getSerialNum());
            updatable.setManufacturer(laptop.getManufacturer());
            updatable.setName(laptop.getName());
            return assortmentRepository.save(updatable);
        }
        else {
            throw new ResourceNotFoundException("Resource not found with id: " + id);
        }    }

    @Override
    public Screen updateScreen(long id, Screen screen) {
        List<Screen> screens = getAllScreens();
        Screen updatable = screens.stream().filter(obj -> obj.getId() == id).findFirst().orElse(null);
        if (updatable != null)
        {
            updatable.setScreenSize(screen.getScreenSize());
            updatable.setNumber(screen.getNumber());
            updatable.setSerialNum(screen.getSerialNum());
            updatable.setManufacturer(screen.getManufacturer());
            updatable.setName(screen.getName());
            return assortmentRepository.save(updatable);
        }
        else {
            throw new ResourceNotFoundException("Resource not found with id: " + id);
        }    }

    @Override
    public List<Computer> getAllComputers() {
        return getAllProducts().stream()
                .filter(obj -> obj instanceof Computer)
                .map(obj -> (Computer)obj)
                .collect(Collectors.toList());
    }

    @Override
    public List<HardDrive> getAllHardDrives() {
        return getAllProducts().stream()
                .filter(obj -> obj instanceof HardDrive)
                .map(obj -> (HardDrive)obj)
                .collect(Collectors.toList());
    }

    @Override
    public List<Laptop> getAllLaptops() {
        return getAllProducts().stream()
                .filter(obj -> obj instanceof Laptop)
                .map(obj -> (Laptop)obj)
                .collect(Collectors.toList());    }

    @Override
    public List<Screen> getAllScreens() {
        return getAllProducts().stream()
                .filter(obj -> obj instanceof Screen)
                .map(obj -> (Screen)obj)
                .collect(Collectors.toList());    }

    @Override
    public List<Product> getAllProducts() {
        return assortmentRepository.findAll();
    }

    @Override
    public Product getProductByID(long id) {
        Optional<Product> productDb = assortmentRepository.findById(id);
        if (productDb.isPresent()) {
            return productDb.get();
        } else
            throw new ResourceNotFoundException("Resource not found with id: " + id);
    }

    @Override
    public void deleteProduct(long id) {
        Optional<Product> productDb = assortmentRepository.findById(id);
        if (productDb.isPresent()) {
            assortmentRepository.delete(productDb.get());
        } else
            throw new ResourceNotFoundException("Resource not found with id: " + id);
    }
}
