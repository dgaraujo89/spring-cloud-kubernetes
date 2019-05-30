package com.github.diegogomesaraujo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.diegogomesaraujo.entities.User;
import com.github.diegogomesaraujo.exceptions.NotFoundException;
import com.github.diegogomesaraujo.repositories.UsersRepository;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersRepository usersRepository;
	
	@GetMapping
	public Page<User> list(@RequestParam(value = "page", defaultValue = "0") Integer page, 
			@RequestParam(value = "size", defaultValue = "10") Integer size) {

		return usersRepository.findAll(PageRequest.of(page, size));
	}
	
	@GetMapping("/{id}")
	public User find(@PathVariable("id") Long id) {
		return usersRepository.findById(id).orElseThrow(() -> new NotFoundException("user not found"));
	}
	
}
