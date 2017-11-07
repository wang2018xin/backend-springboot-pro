package com.wangxin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangxin.pojo.City;
import com.wangxin.service.CityService;

@RestController
//@EnableAutoConfiguration
public class HelloController {

	@Autowired
	private CityService cityService;

	@RequestMapping(value = "/api/city", method = RequestMethod.GET)
	public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
		City c = cityService.findCityByName(cityName);
		System.out.println(c);
		return c;
	}

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

}
