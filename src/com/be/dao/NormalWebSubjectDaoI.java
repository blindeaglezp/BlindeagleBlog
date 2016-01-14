package com.be.dao;

import java.util.List;

import com.be.model.NormalWebSubject;

/**
 * 蝉蛹网站类型数据库操作接口
 * @author blindeagle
 * @version 1.0
 * date 2015-12-04
 */
public interface NormalWebSubjectDaoI {
	
	/**
	 * 查询所有网站类别
	 * @author blindeagle
	 * @return List<NormalWebSubject> 常用网站类别集合
	 */
	public List<NormalWebSubject> queryAllNorWebSub();
	
}
