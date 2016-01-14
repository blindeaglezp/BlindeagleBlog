package com.be.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.be.dao.NormalWebSubjectDaoI;
import com.be.model.NormalWebSubject;
import com.be.utils.JdbcUtil;

/**
 * 常用网站数据库操作类
 * @author blindeagle 
 * @version 1.0
 * date 2015-12-04
 */
public class NormalWebSubjectDaoImpl extends JdbcUtil implements NormalWebSubjectDaoI {
	
	private NormalWebSubject norWebSubObj = null; // 常用网站类别对象
	private List<NormalWebSubject> norWebSubs = null; // 常用网站类别集合

	@Override
	public List<NormalWebSubject> queryAllNorWebSub() {
		String sql = "select norWebSubId,norWebSubject from normalwebsubject";
		rs = getQuery(sql, null);
		norWebSubs = new ArrayList<NormalWebSubject>();
		try {
			while (rs.next()) {
				norWebSubObj = new NormalWebSubject();
				norWebSubObj.setNorWebSubId(rs.getInt(1));
				norWebSubObj.setNorWebSubject(rs.getString(2));
				norWebSubs.add(norWebSubObj);
			}
			return norWebSubs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
