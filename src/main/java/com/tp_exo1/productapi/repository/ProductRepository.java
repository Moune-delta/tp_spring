package com.tp_exo1.productapi.repository;

import com.tp_exo1.productapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}