package com.springpractium.dao;

import java.security.acl.Owner;
import java.util.List;

import com.springpractium.model.User;

public interface UserRepository {
	   
	List<User> findAll();
	User findById(Long id);
	List<User> findByLastName(String lastname);
	void create(Owner owner);
	Owner update(Owner owner);
	void delete(Long id);
	
	
	
}
