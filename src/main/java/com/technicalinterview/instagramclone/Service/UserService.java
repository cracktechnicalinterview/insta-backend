package com.technicalinterview.instagramclone.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technicalinterview.instagramclone.Entity.Users;
import com.technicalinterview.instagramclone.Repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	public Users submitMetaDataOfUser(Users user) {
		return userRepo.save(user);
	}
	
	public Users displayUserMetaData(String userid) {
		return userRepo.findByUserId(userid);
	}
}
