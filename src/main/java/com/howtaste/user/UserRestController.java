package com.howtaste.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.howtaste.common.EncryptUtils;
import com.howtaste.user.bo.UserBO;
import com.howtaste.user.model.User;


@RequestMapping("/user")
@RestController
public class UserRestController {
	
	@Autowired
	private UserBO userBO;
	
	
	@RequestMapping("/is_duplicated_id")
	public Map<String, Object> isDuplicatedId(
			@RequestParam("loginId") String loginId) {
		
		Map<String, Object> result = new HashMap<>();
		int existRowCount = userBO.existLoginId(loginId);
		if (existRowCount > 0) { 
			result.put("result", true);
		} else {
			result.put("result", false);
		}

		return result;
	}
	@PostMapping("/sign_up")
	public Map<String , Object> signUp(
			@RequestParam("loginId")String loginId,
			@RequestParam("password")String password,
			@RequestParam("nickName")String nickName,
			@RequestParam("email")String email,
			@RequestParam("phoneNumber")String phoneNumber){
		
		String encryptPassword = EncryptUtils.md5(password);
		//db insert
		 userBO.addUser(loginId, encryptPassword, nickName, email, phoneNumber);
		//결과 리턴
		Map<String, Object> result = new HashMap<>();
		result.put("result", "success");
		return result;
	}
	@PostMapping("/sign_in")
	public Map<String,Object> signIn(
			@RequestParam("loginId")String loginId,
			@RequestParam("password")String password,
			HttpSession session){
		String encryptPassword = EncryptUtils.md5(password);
		User user =userBO.getUserByLoginIdPassword(loginId,encryptPassword);
		Map<String, Object> result = new HashMap<>();
		if(user != null) {
			session.setAttribute("userId", user.getId());
			session.setAttribute("userLoginId", user.getLoginId());
			session.setAttribute("userName", user.getNickName());
			result.put("result","success");
		}else {
			result.put("errorMessage","존재하지 않음");
		}
		return result;
		
	}
	

}
