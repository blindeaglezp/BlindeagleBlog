package com.be.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.be.model.NormalWeb;
import com.be.service.impl.NormalWebServiceImpl;
import com.be.utils.CharEncodingUtil;

import net.sf.json.JSONArray;

/**
 * 常用网站展示servlet
 * @author blindeagle
 * @version 1.0
 * date 2015-12-04
 */
@WebServlet(name="NormalWebShowServlet", urlPatterns="/servlet/NormalWebShowServlet")
public class NormalWebShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private JSONArray jsonArr = null; // JSON数组
	private NormalWeb norWebObj = null; // 常用网站对象
	private List<NormalWeb> norWebs = null; // 常用网站集合

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		CharEncodingUtil.setEncodingUTF8(request, response);
		
		String type = request.getParameter("type");
		
		switch (type) {
		case "addNormalWeb" : addNormalWeb(request, response); break;
		case "deleteNormalWeb" : deleteNormalWeb(request, response); break;
		case "queryNorWebBySubId" : queryNorWebBySubId(request, response); break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	/**
	 * 添加常用网站
	 * @author blindeagle
	 * @param request 请求对象
	 * @param response 响应对象
	 * @return void
	 */
	private void addNormalWeb(HttpServletRequest request, HttpServletResponse response) {
		int norWebSubId = Integer.parseInt(request.getParameter("norWebSubId"));
		String norWebName = request.getParameter("norWebName");
		String norWebUrl = request.getParameter("norWebUrl");
		norWebObj = new NormalWeb();
		norWebObj.setNorWebName(norWebName);
		norWebObj.setNorWebUrl(norWebUrl);
		norWebObj.setNorWebSubId(norWebSubId);
		String result = new NormalWebServiceImpl().insertNorWeb(norWebObj);
		if ("success".equals(result)) {
			norWebs = new NormalWebServiceImpl().queryNorWebBySubId(norWebSubId);
			jsonArr = JSONArray.fromObject(norWebs);
			try {
				response.getWriter().print(jsonArr);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 删除常用网站
	 * @author blindeagle
	 * @param request 请求对象
	 * @param response 响应对象
	 * @return void
	 */
	private void deleteNormalWeb(HttpServletRequest request, HttpServletResponse response) {
		int norWebSubId = Integer.parseInt(request.getParameter("norWebSubId"));
		String norWebName = request.getParameter("norWebName");
		String result = new NormalWebServiceImpl().deleteNorWebByName(norWebName);
		if ("success".equals(result)) {
			norWebs = new NormalWebServiceImpl().queryNorWebBySubId(norWebSubId);
			jsonArr = JSONArray.fromObject(norWebs);
			try {
				response.getWriter().print(jsonArr);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 根据网站类别ID查询网站
	 * @author blindeagle
	 * @param request 请求对象
	 * @param response 响应对象
	 * @return void
	 */
	private void queryNorWebBySubId(HttpServletRequest request, HttpServletResponse response) {
		int norWebSubId = Integer.parseInt(request.getParameter("norWebSubId"));
		norWebs = new NormalWebServiceImpl().queryNorWebBySubId(norWebSubId);
		jsonArr = JSONArray.fromObject(norWebs);
		try {
			response.getWriter().print(jsonArr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
