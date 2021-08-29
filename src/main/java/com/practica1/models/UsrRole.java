package com.practica1.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usr_roles")
public class UsrRole {
	
	@Id
	@Column(name = "id_role")
	private Long idRole;
	
	private String name;
	
	private String state;
	
	private String observation;
	
	@OneToMany(mappedBy = "role")
	private List<UsrUser> users;
	
	public UsrRole() {
		
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public List<UsrUser> getUsers() {
		return users;
	}

	public void setUsers(List<UsrUser> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "UsrRole [idRole=" + idRole + ", name=" + name + "]";
	}
	
	

}
