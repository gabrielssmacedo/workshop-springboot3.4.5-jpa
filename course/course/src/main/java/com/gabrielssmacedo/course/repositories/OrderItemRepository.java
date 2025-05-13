package com.gabrielssmacedo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielssmacedo.course.entities.OrderItem;
import com.gabrielssmacedo.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
