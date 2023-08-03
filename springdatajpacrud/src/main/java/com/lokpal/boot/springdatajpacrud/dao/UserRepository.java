package com.lokpal.boot.springdatajpacrud.dao;

import org.springframework.data.repository.CrudRepository;

import com.lokpal.boot.springdatajpacrud.entity.User;



public interface UserRepository extends CrudRepository<User, Integer>{

}
