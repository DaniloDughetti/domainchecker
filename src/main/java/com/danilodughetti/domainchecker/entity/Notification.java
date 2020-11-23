package com.danilodughetti.domainchecker.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="notifications")
public class Notification {

	@Id
	@GeneratedValue
	@Getter
	@Setter
	private Integer id;
	
	@Getter
	@Setter
	private NotificationAlert notificationAlert;
	
	@Getter
	@Setter
	private Date runDate;
}