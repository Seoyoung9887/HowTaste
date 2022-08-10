package com.howtaste.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin/post")
@Controller
public class adminPostController {
	
	@RequestMapping("/create_view")
	public String AdminPostCreate(Model model) {
		model.addAttribute("viewName", "admin/admin_post_create");
		return"template/layout";
	}
	

}
