package com.howtaste.post.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.howtaste.post.model.Post;

@Repository
public interface PostDAO {
    
	public Post selectPostList(
			@Param("postId")int postId);
}
