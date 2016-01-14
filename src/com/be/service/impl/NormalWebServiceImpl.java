package com.be.service.impl;

import java.util.List;

import com.be.dao.impl.NormalWebDaoImpl;
import com.be.model.NormalWeb;
import com.be.service.NormalWebServiceI;

/**
 * 常用网站数据逻辑处理类
 * @author blindeagle
 * @version 1.0
 * date 2015-12-04
 */
public class NormalWebServiceImpl implements NormalWebServiceI {
	
	@Override
	public List<NormalWeb> queryNorWebBySubId(int norWebSubId) {
		return new NormalWebDaoImpl().queryNorWebBySubId(norWebSubId);
	}

	@Override
	public String insertNorWeb(NormalWeb norWeb) {
		int result = new NormalWebDaoImpl().insertNorWeb(norWeb);
		if (result > 0) {
			return "success";
		}
		return "fail";
	}

	@Override
	public String deleteNorWebByName(String norWebName) {
		int result = new NormalWebDaoImpl().deleteNorWebByName(norWebName);
		if (result > 0) {
			return "success";
		}
		return "fail";
	}

}
