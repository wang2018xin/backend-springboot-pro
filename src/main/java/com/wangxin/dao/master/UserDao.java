package com.wangxin.dao.master;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wangxin.pojo.User;

@Mapper
public interface UserDao {
	User findByName(@Param("userName") String userName);

	User login(@Param("userName") String userName, @Param("userPwd") String userPwd);
	
	List<User> getUserList(Map<String, Object> map);
	
	Integer getUserListCount(Map<String, Object> map);
}
