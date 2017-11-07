package com.wangxin.dao.cluster;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wangxin.pojo.City;

@Mapper
public interface CityDao {
	City findByName(@Param("cityName") String cityName);
}
