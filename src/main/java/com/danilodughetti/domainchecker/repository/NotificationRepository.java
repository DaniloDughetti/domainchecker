package com.danilodughetti.domainchecker.repository;

import org.springframework.data.repository.CrudRepository;

import com.danilodughetti.domainchecker.entity.Notification;

public interface NotificationRepository extends CrudRepository<Notification, Integer>{

}
