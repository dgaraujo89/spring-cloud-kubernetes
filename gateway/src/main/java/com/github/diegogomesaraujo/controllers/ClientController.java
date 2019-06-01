package com.github.diegogomesaraujo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.diegogomesaraujo.clients.UsersClientService;
import com.github.diegogomesaraujo.clients.dto.User;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private UsersClientService usersClientService;
	
	@GetMapping("/{id}")
	public User findById(@PathVariable("id") Long id) {
		return usersClientService.findByid(id);
	}
	
}
