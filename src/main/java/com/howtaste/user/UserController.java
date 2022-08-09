package com.howtaste.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("user")
@Controller
public class UserController {
	
	@RequestMapping("/sign_up_view")
	public String signUpView(Model model) {
		model.addAttribute("viewName", "user/sign_up");
		return"template/layout";
	}
	@PostMapping("/sign_up_for_submit")
	public String sifnUpFotSubmit(
			@RequestParam("loginId")String loginId,
			@RequestParam("password")String password,
			@RequestParam("nickName")String name,
			@RequestParam("email")String email,
			@RequestParam("phoneNumber")String phoneNumber) {
		//DB insert
		
		return "redirect:/user/sign_in_view";
	}
	
	@RequestMapping("/sign_in_view")
	public String signInView(Model model) {
		model.addAttribute("viewName", "user/sign_in");
		return "template/layout";
	}
	

}
