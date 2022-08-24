package com.howtaste.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.howtaste.post.bo.PostBO;
import com.howtaste.post.model.Post;

@RequestMapping("/post")
@Controller
public class postController {
	@Autowired
	private PostBO postBO;
	
	@RequestMapping("/post_main_view")
	public String mainView(Model model) {
		List<Post> postList = postBO.getList();
		model.addAttribute("postList", postList);
		model.addAttribute("viewName", "post/post_main");
		return"template/layout";
	}
	@RequestMapping("/post_detail_view")
	public String detailView(
			@RequestParam("postId")int postId,
			Model model) {
		Post post= postBO.getPostList(postId);
		model.addAttribute("post", post);
		model.addAttribute("viewName", "post/post_detail");
		return"template/layout";
	}


}
