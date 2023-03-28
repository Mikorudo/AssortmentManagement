package com.example.assortmentmanagement.controllers;

import com.example.assortmentmanagement.exception.ResourceNotFoundException;
import com.example.assortmentmanagement.models.*;
import com.example.assortmentmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class AssortmentController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok().body(productService.getAllProducts());
    }

    @GetMapping("/products/computers")
    public ResponseEntity<List<Computer>> getAllComputers() {
        return ResponseEntity.ok().body(productService.getAllComputers());
    }

    @GetMapping("/products/harddrives")
    public ResponseEntity<List<HardDrive>> getAllHardDrives() {
        return ResponseEntity.ok().body(productService.getAllHardDrives());
    }

    @GetMapping("/products/laptops")
    public ResponseEntity<List<Laptop>> getAllLaptops() {
        return ResponseEntity.ok().body(productService.getAllLaptops());
    }

    @GetMapping("/products/screens")
    public ResponseEntity<List<Screen>> getAllScreens() {
        return ResponseEntity.ok().body(productService.getAllScreens());
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id) {
        try {
            return ResponseEntity.ok().body(productService.getProductByID(id));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/products/computers")
    public ResponseEntity<Computer> createComputer(@RequestBody Computer computer) {
        return ResponseEntity.ok().body(productService.createComputer(computer));
    }

    @PostMapping("/products/harddrives")
    public ResponseEntity<HardDrive> createHardDrive(@RequestBody HardDrive hardDrive) {
        return ResponseEntity.ok().body(productService.createHardDrive(hardDrive));
    }

    @PostMapping("/products/laptops")
    public ResponseEntity<Laptop> createLaptop(@RequestBody Laptop laptop) {
        return ResponseEntity.ok().body(productService.createLaptop(laptop));
    }

    @PostMapping("/products/screens")
    public ResponseEntity<Screen> createScreen(@RequestBody Screen screen) {
        return ResponseEntity.ok().body(productService.createScreen(screen));
    }

    @PutMapping("/products/computers/{id}")
    public ResponseEntity<Computer> updateComputer(@PathVariable long id, @RequestBody Computer computer) {
        try {
            return ResponseEntity.ok().body(productService.updateComputer(id, computer));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/products/harddrives/{id}")
    public ResponseEntity<HardDrive> updateHardDrive(@PathVariable long id, @RequestBody HardDrive hardDrive) {
        try {
            return ResponseEntity.ok().body(productService.updateHardDrive(id, hardDrive));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/products/laptops/{id}")
    public ResponseEntity<Laptop> updateLaptop(@PathVariable long id, @RequestBody Laptop laptop) {
        try {
            return ResponseEntity.ok().body(productService.updateLaptop(id, laptop));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/products/screens/{id}")
    public ResponseEntity<Screen> createScreen(@PathVariable long id, @RequestBody Screen screen) {
        try {
            return ResponseEntity.ok().body(productService.updateScreen(id, screen));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable long id) {
        try {
            productService.deleteProduct(id);
            return ResponseEntity.ok().build();
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
