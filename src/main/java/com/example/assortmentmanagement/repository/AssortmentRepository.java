package com.example.assortmentmanagement.repository;

import com.example.assortmentmanagement.models.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssortmentRepository extends JpaRepository<Product, Long> {

}
