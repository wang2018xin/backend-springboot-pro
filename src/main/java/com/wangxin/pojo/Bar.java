package com.wangxin.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 读取配置文件
 * 
 */
@Component
@ConfigurationProperties(locations = "classpath:conf/application-test.yml", prefix = "Mybar")
public class Bar {
	private String name;
	private String[] arrs;
	private List<Map<String, String>> nameList;
	private List<String> BarNameList;
	private Map<String, String> map;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getArrs() {
		return arrs;
	}

	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}

	public List<Map<String, String>> getNameList() {
		return nameList;
	}

	public void setNameList(List<Map<String, String>> nameList) {
		this.nameList = nameList;
	}

	public List<String> getBarNameList() {
		return BarNameList;
	}

	public void setBarNameList(List<String> barNameList) {
		BarNameList = barNameList;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Bar [name=" + name + ", arrs=" + Arrays.toString(arrs) + ", nameList=" + nameList + ", BarNameList="
				+ BarNameList + ", map=" + map + ", getName()=" + getName() + ", getArrs()="
				+ Arrays.toString(getArrs()) + ", getNameList()=" + getNameList() + ", getBarNameList()="
				+ getBarNameList() + ", getMap()=" + getMap() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
