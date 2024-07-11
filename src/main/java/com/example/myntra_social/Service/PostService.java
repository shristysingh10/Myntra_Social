package com.example.myntra_social.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.myntra_social.Entity.Post;
import com.example.myntra_social.Repository.PostRepo;

@Service
public class PostService {

	 @Autowired
	 PostRepo postRepo;
	 
	 @Autowired
	 UserService userService;
	 
     public Post submitPostToDataBase(Post post) {
    	 return postRepo.save(post);
     }
	
     public ArrayList<Post>retrivePostFromDB()
     {
    	 ArrayList<Post>postList=postRepo.findAll();
    	 for(int i=0;i<postList.size();i++)
    	 {
    		 Post postItem=postList.get(i);
    		 postItem.setUserName(userService.displayUserMetaData(postItem.getUserId()).getUserName());
    	 }
    	return postList;
     }
}
