package com.be.dao;

import java.util.List;

import com.be.model.NormalWeb;

/**
 * 常用网站数据库操作接口
 * @author blindeagle
 * @version 1.0
 * date 2014-12-04
 */
public interface NormalWebDaoI {
	
	/**
	 * 根据类别号查询常用网站信息
	 * @author blindeagle
	 * @param norWebSubId 常用网站类别ID号
	 * @return List<NormalWeb> 常用网站集合
	 */
	public List<NormalWeb> queryNorWebBySubId(int norWebSubId);
	
	/**
	 * 添加常用网站
	 * @author blindeagle
	 * @param norWeb 常用网站对象
	 * @return int 数据库受影响的记录条数
	 */
	public int insertNorWeb(NormalWeb norWeb);
	
	/**
	 * 根据常用网站名删除网站
	 * @author blindeagle
	 * @param norWebName 网站名
	 * @return int 数据库受影响的记录条数
	 */
	public int deleteNorWebByName(String norWebName);
	
}
