package com.howtaste.admin.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public interface AdminDAO {
	public void insertAdminPost(
			@Param("userId") int userId,
			@Param("userLoginId") String userLoginId,
			@Param("name") String name,
			@Param("address") String address,
			@Param("number") String number, 
			@Param("kind") String kind, 
			@Param("price") String price, 
			@Param("park") String park, 
			@Param("businessHours") String businessHours, 
			@Param("lastOder") String lastOder, 
			@Param("closingDay") String closingDay, 
			@Param("delegateMenu") String delegateMenu,
			@Param("coordinate") String coordinate
			);
	public void insertAdminImage(
			
			@Param("userLoginId") String userLoginId,
			@Param("postId") int postId,
			@Param("imagePath") String imagePath);

}
