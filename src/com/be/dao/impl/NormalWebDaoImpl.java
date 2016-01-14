package com.be.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.be.dao.NormalWebDaoI;
import com.be.model.NormalWeb;
import com.be.utils.JdbcUtil;

/**
 * 常用网站数据库操作实现类
 * @author blindeagle
 * @version 1.0
 * date 2015-12-04
 */
public class NormalWebDaoImpl extends JdbcUtil implements NormalWebDaoI {

	private NormalWeb normalWebObj = null; // 常用网站对象
	private List<NormalWeb> normalWebs = null; // 常用网站集合
	
	@Override
	public List<NormalWeb> queryNorWebBySubId(int norWebSubId) {
		String sql = "select norWebId,norWebName,norWebUrl from normalweb where norWebSubId=?";
		Integer[] params = new Integer[] {norWebSubId};
		rs = getQuery(sql, params);
		normalWebs = new ArrayList<NormalWeb>();
		try {
			while (rs.next()) {
				normalWebObj = new NormalWeb();
				normalWebObj.setNorWebId(rs.getInt(1));
				normalWebObj.setNorWebName(rs.getString(2));
				normalWebObj.setNorWebUrl(rs.getString(3));
				normalWebObj.setNorWebSubId(norWebSubId);
				normalWebs.add(normalWebObj);
			}
			return normalWebs;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			releaseConnection();
		}
		return null;
	}

	@Override
	public int insertNorWeb(NormalWeb norWeb) {
		String sql = "insert into normalweb(norWebName,norWebUrl,norWebSubId) values(?,?,?)";
		Object[] params = new Object[] {norWeb.getNorWebName(), norWeb.getNorWebUrl(), norWeb.getNorWebSubId()};
		return getUpdate(sql, params);
	}

	@Override
	public int deleteNorWebByName(String norWebName) {
		String sql = "delete from normalweb where norWebName=?";
		String[] params = new String[] {norWebName};
		return getUpdate(sql, params);
	}

}
