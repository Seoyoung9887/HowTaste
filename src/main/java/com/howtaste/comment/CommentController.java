package com.howtaste.comment;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@RequestMapping("/comment")
@Controller
public class CommentController {
    
	
	@RequestMapping("/comment_create_view")
	public String mainView(Model model) {
		
		
		model.addAttribute("viewName", "comment/comment_view");
		return"template/layout";
	}
}
