package com.wangxin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wangxin.pojo.Bar;

@RestController
@EnableAutoConfiguration
public class HelloController {

	@Autowired
	private Bar bar;

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/hello/{myName}")
	String index(@PathVariable String myName) {
		return "Hello " + myName + "!!!";
	}

	/**
	 * 读取配置文件(application-test.yml)
	 */
	@RequestMapping("/bar")
	String getConf() {
		return bar.toString();
	}
}
