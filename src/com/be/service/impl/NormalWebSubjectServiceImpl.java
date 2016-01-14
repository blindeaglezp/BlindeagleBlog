package com.be.service.impl;

import java.util.List;

import com.be.dao.impl.NormalWebSubjectDaoImpl;
import com.be.model.NormalWebSubject;
import com.be.service.NormalWebSubjectServiceI;

/**
 * 常用网站类别数据逻辑处理类
 * @author blindeagle
 * @version 1.0
 * date 2015-12-04
 */
public class NormalWebSubjectServiceImpl implements NormalWebSubjectServiceI {

	@Override
	public List<NormalWebSubject> queryAllNorWebSub() {
		return new NormalWebSubjectDaoImpl().queryAllNorWebSub();
	}

}
