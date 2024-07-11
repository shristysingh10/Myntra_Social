package com.example.myntra_social.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myntra_social.Entity.Post;
import com.example.myntra_social.Service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
	@Autowired
	PostService postService;
	@PostMapping("")
	private Post submitUserPost(@RequestBody Post post) {
		 return postService.submitPostToDataBase(post);
	}
	@GetMapping("")
	private ArrayList<Post>getAllPost()
	{
		return postService.retrivePostFromDB();
	}

}
