package com.wangxin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangxin.dao.cluster.CityDao;
import com.wangxin.dao.master.UserDao;
import com.wangxin.pojo.City;
import com.wangxin.pojo.User;
import com.wangxin.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private CityDao cityDao;

	@Autowired
	private UserDao userDao;

	@Override
	public User findByName(String userName) {
		User user = userDao.findByName(userName);
		City city = cityDao.findByName("沈阳");
		user.setCity(city);
		return user;
	}

}
