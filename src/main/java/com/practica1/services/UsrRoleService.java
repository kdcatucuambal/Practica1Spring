package com.practica1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica1.models.UsrRole;
import com.practica1.repository.UsrRoleRepository;



@Service
public class UsrRoleService {
	
	@Autowired
	private UsrRoleRepository roleRepo;
	
	public List<UsrRole> getAllRoles(){
		return (List<UsrRole>) this.roleRepo.findAll();
	}
	
	public UsrRole getRoleById(Long id) {
		return this.roleRepo.findById(id).orElse(null);
	}
	
	public void saveRole(UsrRole role) {
		this.roleRepo.save(role);
	}
	
	public void delete (UsrRole role) {
		this.roleRepo.delete(role);
	}

}
