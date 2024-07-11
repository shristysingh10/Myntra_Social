package com.example.myntra_social.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.myntra_social.Entity.Comments;

@Repository
public interface CommentRepo extends CrudRepository<Comments,Integer> {
   Comments save(Comments comment);
   ArrayList<Comments>findAllByPostId(String postId);
}
