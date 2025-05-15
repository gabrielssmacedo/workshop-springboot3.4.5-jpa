package com.gabrielssmacedo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielssmacedo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
