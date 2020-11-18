package com.danilodughetti.domainchecker.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class User {
	
	@Id
	@Getter
	@Setter
	private String email;
		 
	@Getter       
	@Setter       
	private String password;
	 
	@Getter       
	@Setter       
	private String surname;
	 
	@Getter       
	@Setter       
	private String name;
	 
	@Getter       
	@Setter       
	private Date dateCreation;
}
