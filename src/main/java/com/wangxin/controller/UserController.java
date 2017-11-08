package com.wangxin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wangxin.common.Constant;
import com.wangxin.pojo.User;
import com.wangxin.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Map<String, Object> findByName(@RequestBody Map<String, Object> map) {
		Map<String, Object> result = new HashMap<String, Object>();
		String userName = map.get("userName").toString();
		String userPwd = map.get("userPwd").toString();
		System.out.println("userName=" + userName + ",userPwd=" + userPwd);
		User user = userService.login(userName, userPwd);
		String state = (user != null) ? Constant.APP_STATE_NORMAL_FALG : Constant.APP_STATE_ERROR_FLAG;
		result.put("state", state);
		result.put("data", user);
		return result;
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public Map<String, Object> findUserList(@RequestBody Map<String, Object> map) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<User> list = userService.getUserList(map);
		Integer total = userService.getUserListCount();
		result.put("data", list);
		result.put("total", total);
		return result;
	}

}
