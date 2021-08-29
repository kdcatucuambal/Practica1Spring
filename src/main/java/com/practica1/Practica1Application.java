package com.practica1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practica1.services.UsrRoleService;

@SpringBootApplication
public class Practica1Application implements CommandLineRunner {

	@Autowired
	private UsrRoleService roleService;
	
	public static void main(String[] args) {
		SpringApplication.run(Practica1Application.class, args);
	}
	
	public void run(String... args) throws Exception {
		this.roleService.getAllRoles().forEach(role->{
			System.out.println(role);
		});
	}

}
