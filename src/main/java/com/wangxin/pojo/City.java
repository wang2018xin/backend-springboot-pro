package com.wangxin.pojo;

public class City {

	private Long id;
	private String cityName;
	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", cityName=" + cityName + ", content=" + content + ", getId()=" + getId() + ", getCityName()=" + getCityName()
				+ ", getContent()=" + getContent() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
