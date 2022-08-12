package com.howtaste.admin;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.howtaste.admin.bo.AdminBO;

@RequestMapping("/admin/post")
@RestController
public class adminPostRestController {
	
	@Autowired
	private AdminBO adminBO;
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
			@RequestParam(value="coordinate", required=false) String coordinate,
			@RequestParam("file") MultipartFile file,
			HttpSession session){
		Map<String, Object> result = new HashMap<>();
		Integer userId = (Integer) session.getAttribute("userId");
		String userLoginId = (String) session.getAttribute("userLoginId");
		if (userId == null) {
			result.put("result", "error");
			result.put("errorMessage", "로그인을 해주세요.");
			return result;
		}
		
		adminBO.addAdminPost(userId, userLoginId, name, address, number, kind, price, park, businessHours, lastOder, closingDay, delegateMenu, coordinate);
		
		
		return result;
	}

}
