package com.mybatis.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mybatis.dao.UserDao;
import com.mybatis.model.User;
import com.mybatis.service.UserService;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

	@Override
	public Boolean isDeleteUser(int id) {
		boolean flag=false;
		int num=0;
		num=this.userDao.deleteByPrimaryKey(id);
		if (num!=0) {
			flag=true;
		}
		return flag;
	}

}
