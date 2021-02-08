package com.technicalinterview.instagramclone.Service;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technicalinterview.instagramclone.Entity.Post;
import com.technicalinterview.instagramclone.Entity.Status;
import com.technicalinterview.instagramclone.Repository.PostRepo;

@Service
public class PostService {

	@Autowired
	PostRepo postRepo;
	
	@Autowired
	UserService userService;
	
	public Post submitPostToDataBase(Post post) {
		return postRepo.save(post);
	}
	
	public ArrayList<Post> retrivePostFromDB(){

		ArrayList<Post> postList=postRepo.findAll();
		
		for(int i=0;i<postList.size();i++) {
			Post postItem=postList.get(i);
			postItem.setUserName(userService.displayUserMetaData(postItem.getUserId()).getUserName());
		}
		Collections.sort(postList,(a,b)->b.getId()-a.getId());
		return postList;
	}
	
}
