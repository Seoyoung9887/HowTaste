package com.howtaste.user.bo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtaste.user.dao.UserDAO;
import com.howtaste.user.model.User;


@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;
	
	
	public int existLoginId(String ioginId) {
		return userDAO.existLoginId(ioginId);
	}
	public void addUser(String loginId,String password , String nickName, String email, String phoneNumber) {
		userDAO.insertUser(loginId, password, nickName, email, phoneNumber);
	}
	  public User getUserByLoginIdPassword(String loginId, String password) {
	    	return userDAO.selectUserByLoginIdPassword(loginId, password);
	    }

}
