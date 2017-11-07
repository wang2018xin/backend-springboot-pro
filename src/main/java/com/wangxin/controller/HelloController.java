package com.wangxin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangxin.pojo.User;
import com.wangxin.service.UserService;

@RestController
// @EnableAutoConfiguration
public class HelloController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/api/user", method = RequestMethod.GET)
	public User findByName(@RequestParam(value = "userName", required = true) String userName) {
		return userService.findByName(userName);
	}

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

}
