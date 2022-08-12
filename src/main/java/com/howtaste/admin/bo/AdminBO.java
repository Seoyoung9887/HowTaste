package com.howtaste.admin.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.howtaste.admin.dao.AdminDAO;
import com.howtaste.common.FileManagerService;

@Service
public class AdminBO {
	
	@Autowired
	private AdminBO adminBO;
	@Autowired
	private FileManagerService fileManager;
	@Autowired
	private AdminDAO adminDAO;
	public void addAdminPost(int userId,String userLoginId,String name,String address,String number, String kind, String price, String park, String businessHours, String lastOder, String closingDay, String delegateMenu, String coordinate) {
		adminDAO.insertAdminPost(userId, userLoginId, name, address, number, kind, price, park, businessHours, lastOder, closingDay, delegateMenu, coordinate);
		
	}
	public void addAdminImage(String userLoginId,int postId,MultipartFile file) {
		String imagePath = null;
		//파일이 있으면 파일 업로드 => path 리턴 받음
		if(file != null) {
			  imagePath = fileManager.saveFile(userLoginId, file);
		}
		adminDAO.insertAdminImage(userLoginId,postId,imagePath);
	}

}
