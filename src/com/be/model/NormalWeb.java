package com.be.model;

/**
 * 常用网站实体类
 * 
 * @author blindeagle
 * @version 1.0 date 2015-12-04
 */
public class NormalWeb {

	private int norWebId; // 常用网站ID号
	private String norWebName; // 常用网站名称
	private String norWebUrl; // 常用网站URL地址
	private int norWebSubId; // 常用网站类别ID号

	public int getNorWebId() {
		return norWebId;
	}

	public void setNorWebId(int norWebId) {
		this.norWebId = norWebId;
	}

	public String getNorWebName() {
		return norWebName;
	}

	public void setNorWebName(String norWebName) {
		this.norWebName = norWebName;
	}

	public String getNorWebUrl() {
		return norWebUrl;
	}

	public void setNorWebUrl(String norWebUrl) {
		this.norWebUrl = norWebUrl;
	}

	public int getNorWebSubId() {
		return norWebSubId;
	}

	public void setNorWebSubId(int norWebSubId) {
		this.norWebSubId = norWebSubId;
	}

}
