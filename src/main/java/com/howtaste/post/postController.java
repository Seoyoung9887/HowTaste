package com.howtaste.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/post")
@Controller
public class postController {
	
	@RequestMapping("/post_main_view")
	public String mainView(Model model) {
		
		model.addAttribute("viewName", "post/post_main");
		return"template/layout";
	}

}
