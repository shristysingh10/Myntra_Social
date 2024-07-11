package com.example.myntra_social.Repository;

import org.springframework.stereotype.Repository;

import com.example.myntra_social.Entity.Users;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepo extends CrudRepository<Users,Integer>{

	@SuppressWarnings("unchecked")
	Users save(Users user);
	Users findByUserId(String userId);
	
	
	
	
}
