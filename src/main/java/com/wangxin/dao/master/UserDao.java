package com.wangxin.dao.master;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wangxin.pojo.User;

@Mapper
public interface UserDao {
	User findByName(@Param("userName") String userName);
}
