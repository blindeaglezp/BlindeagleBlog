package com.be.utils;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 字符编码工具类
 * @author blindeagle
 * @version 1.0
 * date 2015-12-04
 */
public class CharEncodingUtil {

	/**
	 * 设置编码为UTF-8
	 * @author blindeagle
	 * @param request 请求对象
	 * @param response 响应对象
	 * @return void 
	 */
	public static void setEncodingUTF8(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
}
