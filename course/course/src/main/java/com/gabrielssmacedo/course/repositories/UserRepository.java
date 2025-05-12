package com.gabrielssmacedo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielssmacedo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
