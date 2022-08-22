package com.howtaste.post.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtaste.post.dao.PostDAO;
import com.howtaste.post.model.Post;

@Service
public class PostBO {
	@Autowired
	private PostDAO postDAO;
	
	public Post getPostList(int postId){
		return postDAO.selectPostList(postId);
	}

}
