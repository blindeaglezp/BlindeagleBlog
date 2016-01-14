package com.be.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户权限检测工具类
 * @author blindeagle
 * @version 1.0
 * date 2015-12-04
 */
public class CheckUserUtil {

	/**
	 * 判断管理员是否登录
	 * @author blindeagle
	 * @param request 请求对象
	 * @return 若登录，返回yes，否则返回no
	 */
	public static String checkAdmin(HttpServletRequest request) {
		String username = (String) request.getSession().getAttribute("username");
		if ("blindeagle".equals(username)) {
			return "yes";
		} else {
			return "no";
		}
	}
	
}
