package com.mybatis.service;


import com.mybatis.model.User;
public interface UserService {
	
	User getUserById(int userId);
	Boolean isDeleteUser(int id);
	
	

}
