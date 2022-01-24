package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.UserDepartment;
import com.example.entity.User;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping
	public User saveUser(@RequestBody User user) {
		log.info("Save User :: " + user);
		return service.saveUser(user);
	}

	@GetMapping("/{id}")
	public UserDepartment getUserById(@PathVariable("id") Long id) {
		log.info("Search User :: " + id);
		return service.getUserById(id);
	}
}
