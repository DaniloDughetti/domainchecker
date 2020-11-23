package com.danilodughetti.domainchecker.repository;

import org.springframework.data.repository.CrudRepository;

import com.danilodughetti.domainchecker.entity.Domain;

public interface DomainRepository extends CrudRepository<Domain, Integer>{

}
