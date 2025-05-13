package com.gabrielssmacedo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielssmacedo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
