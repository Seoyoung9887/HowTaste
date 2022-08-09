package com.howtaste.user.dao;



import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.howtaste.user.model.User;



@Repository
public interface UserDAO {
	
	public int existLoginId(String ioginId);
	public void insertUser(
			@Param("loginId") String loginId,
			@Param("password") String password, 
			@Param("nickName") String nickName, 
			@Param("email") String email,
			@Param("phoneNumber")String phoneNumber);
	public User selectUserByLoginIdPassword(
			@Param("loginId") String loginId, 
			@Param("password") String password);

}
