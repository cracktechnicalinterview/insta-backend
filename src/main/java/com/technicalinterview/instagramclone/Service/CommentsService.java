package com.technicalinterview.instagramclone.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technicalinterview.instagramclone.Entity.Comments;
import com.technicalinterview.instagramclone.Entity.Status;
import com.technicalinterview.instagramclone.Repository.CommentRepo;

@Service
public class CommentsService {
	
	@Autowired
	CommentRepo commentRepo;
	
	@Autowired
	UserService userService;
	
	public Comments submitCommentToDB(Comments comment) {
		return commentRepo.save(comment);
	}
	
	public ArrayList<Comments> getAllCommentsForDB(String postId){
		
		ArrayList<Comments> commentList=commentRepo.findAllByPostId(postId);
		
		for(int i=0;i<commentList.size();i++) {
			Comments commentItem=commentList.get(i);
			commentItem.setUserName(userService.displayUserMetaData(commentItem.getUserId()).getUserName());
		}
		
		return commentList;
		
	}
}
