package com.practica1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practica1.models.UsrRole;
import com.practica1.services.UsrRoleService;

@RestController
@RequestMapping("/api")
public class UsrRoleController {
	
	@Autowired
	private UsrRoleService roleService;
	
	@RequestMapping(value = "/roles", method = RequestMethod.GET)
	public List<UsrRole> getAll() {
		return this.roleService.getAllRoles();
	}
	
	@RequestMapping(value = "/testing", method = RequestMethod.GET)
	public String testing(){
		System.out.println("Logger");
		return "Hello";
	}

}
