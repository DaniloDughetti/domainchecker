package com.danilodughetti.domainchecker.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="domains")
public class Domain {

	@Id    
	@GeneratedValue
	@Getter
	@Setter
	private Integer id;
	
	@ManyToMany
	@Getter
	@Setter
	private List<User> user;

	@Getter
	@Setter
	private String url;
	
	@Getter
	@Setter
	private String email;
	
	@Getter
	@Setter
	private String nameservers;
	
	@Getter
	@Setter
	private String registrar;
	
	@Getter
	@Setter
	private String registrarname;
	
	@Getter
	@Setter
	private String status;
	
	@Getter
	@Setter
	private Date dateCreation;
	
	@Getter
	@Setter
	private Date dateExpiration;
	
	@Getter
	@Setter
	private Date dateUpdated;
}
