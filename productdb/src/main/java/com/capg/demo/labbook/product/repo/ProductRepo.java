package com.capg.demo.labbook.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.demo.labbook.product.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
