package com.gabrielssmacedo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielssmacedo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
