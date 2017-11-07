package com.wangxin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangxin.dao.CityDao;
import com.wangxin.pojo.City;
import com.wangxin.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao dao;

	@Override
	public City findCityByName(String cityName) {
		return dao.findByName(cityName);
	}

}
