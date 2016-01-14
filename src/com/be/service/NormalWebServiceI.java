package com.be.service;

import java.util.List;

import com.be.model.NormalWeb;

/**
 * 常用网站数据逻辑处理接口
 * @author blindeagle
 * @version 1.0
 * date 2015-12-04
 */
public interface NormalWebServiceI {

	/**
	 * 根据常用网站类型ID查询网站信息
	 * @author blindeagle
	 * @param norWebSubId 常用网站类型ID
	 * @return List<NormalWeb> 查询到的信息集合
	 */
	public List<NormalWeb> queryNorWebBySubId(int norWebSubId);
	
	/**
	 * 添加常用网站
	 * @author blindeagle
	 * @param norWeb 常用网站对象
	 * @return String 添加成功，返回success；添加失败，返回fail
	 */
	public String insertNorWeb(NormalWeb norWeb);
	
	/**
	 * 根据网站名删除网站
	 * @author blindeagle
	 * @param norWebName 常用网站名
	 * @return 删除成功，返回success；删除失败，返回fail
	 */
	public String deleteNorWebByName(String norWebName);
	
}
