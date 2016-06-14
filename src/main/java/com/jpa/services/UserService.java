package com.jpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.dao.UserDaoInt;
import com.jpa.entities.User;

@Qualifier(value="userService")
@Service
public class UserService implements UserServiceInt {

	@Autowired
	private UserDaoInt userDao;

	@Override
	@Transactional
	public User getUser(Integer id) {
		return userDao.getById(id);
	}

}
