package com.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mybatis.dao.UserMapper;
import com.mybatis.model.User;
import com.mybatis.service.UserService;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserById(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

}
