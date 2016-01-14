package com.be.service;

import java.util.List;

import com.be.model.NormalWebSubject;

/**
 * 常用网站类别数据逻辑处理接口
 * @author blindeagle
 * @version 1.0
 * date 2015-12-04
 */
public interface NormalWebSubjectServiceI {
	
	/**
	 * 查询所有的常用网站类别
	 * @author blindeagle
	 * @return List<NormalWebSubject> 查询到的常用网站类别集合
	 */
	public List<NormalWebSubject> queryAllNorWebSub();
	
}
