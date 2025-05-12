package com.gabrielssmacedo.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielssmacedo.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Gabriel", "gabriel@gmail,com", "(11) 4002-8922", "123456#");
		return ResponseEntity.ok(user);
	}
}
