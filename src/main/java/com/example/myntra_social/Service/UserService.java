package com.example.myntra_social.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myntra_social.Entity.Users;
import com.example.myntra_social.Repository.UserRepo;

@Service
public class UserService 
{
	@Autowired
	UserRepo userRepo;
	public Users submitMetaDataOfUser(Users user)
	{
		
		return userRepo.save(user);
	}

	public Users displayUserMetaData(String userid)
	{
		return  userRepo.findByUserId(userid);
	}
	
	
}
