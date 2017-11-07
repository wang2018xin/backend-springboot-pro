package com.wangxin.service;

import com.wangxin.pojo.User;

public interface UserService {
	User findByName(String userName);
}
