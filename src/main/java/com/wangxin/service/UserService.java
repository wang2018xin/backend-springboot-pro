package com.wangxin.service;

import java.util.List;
import java.util.Map;

import com.wangxin.pojo.User;

public interface UserService {
	
	User findByName(String userName);
	
	User login(String userName, String userPwd);
	
	List<User> getUserList(Map<String, Object> map);
	
	Integer getUserListCount();
}
