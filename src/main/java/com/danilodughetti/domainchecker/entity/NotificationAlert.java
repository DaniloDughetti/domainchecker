package com.danilodughetti.domainchecker.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="notificationalerts")
public class NotificationAlert {

	@Id
    @GeneratedValue
	@Getter
	@Setter
	private Integer id;
	
	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "user")
	private User user;
	
	@Getter
	@Setter
	@ManyToMany
	@JoinTable(
	  name = "mailinglists", 
	  joinColumns = @JoinColumn(name = "notificationalert"), 
	  inverseJoinColumns = @JoinColumn(name = "user"))
	private List<User> mailingList;
	
	@Getter
	@Setter
	private Integer activationTime;
	
	@Getter
	@Setter
	private Integer active;
}
