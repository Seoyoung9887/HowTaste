package com.howtaste.post;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/admin/post")
@RestController
public class adminPostRestController {
	
	@PostMapping("/create")
	public Map<String , Object> create(
			@RequestParam("name") String name,
			@RequestParam("address") String address,
			@RequestParam("number") String number,
			@RequestParam("kind") String kind,
			@RequestParam("price") String price,
			@RequestParam("park") String park,
			@RequestParam("businessHours") String businessHours,
			@RequestParam("lastOder") String lastOder,
			@RequestParam("closingDay") String closingDay,
			@RequestParam("delegateMenu") String delegateMenu,
			@RequestParam("file") MultipartFile file,
			HttpSession session){
		Map<String, Object> result = new HashMap<>();
		Integer userId = (Integer) session.getAttribute("userId");
		String userLoginId = (String) session.getAttribute("userLoginId");
		
		return null;
	}

}
