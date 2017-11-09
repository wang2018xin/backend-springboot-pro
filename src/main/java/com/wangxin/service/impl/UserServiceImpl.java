package com.wangxin.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@Override
	public User login(String userName, String userPwd) {
		User user = userDao.login(userName, userPwd);
		return user;
	}

	@Override
	public List<User> getUserList(Map<String, Object> map) {
		// Map<String, Object> param = new HashMap<String, Object>();
		int pageNum = Integer.parseInt(map.get("pageNum").toString());
		int pageSize = Integer.parseInt(map.get("pageSize").toString());
		map.put("pageNum", (pageNum - 1) * pageSize);
		// param.put("pageSize", pageSize);
		List<User> list = userDao.getUserList(map);
		return list;
	}

	@Override
	public Integer getUserListCount(Map<String, Object> map) {
		Integer total = userDao.getUserListCount(map);
		return total;
	}

}
