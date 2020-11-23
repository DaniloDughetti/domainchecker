package com.danilodughetti.domainchecker.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@Getter
	@Setter
	private String email;
	
	@ManyToMany
	@JoinTable(
	  name = "watcheddomains", 
	  joinColumns = @JoinColumn(name = "user"), 
	  inverseJoinColumns = @JoinColumn(name = "domain"))
	@Getter
	@Setter
	private List<Domain> domains;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "user")
	private List<NotificationAlert> notificationAlerts;
		 
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
