package com.danilodughetti.domainchecker.repository;

import org.springframework.data.repository.CrudRepository;

import com.danilodughetti.domainchecker.entity.User;

public interface UserRepository extends CrudRepository<User, String> {

}
