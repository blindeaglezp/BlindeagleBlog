package com.be.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.be.model.NormalWeb;
import com.be.model.NormalWebSubject;
import com.be.service.impl.NormalWebServiceImpl;
import com.be.service.impl.NormalWebSubjectServiceImpl;
import com.be.utils.CharEncodingUtil;
import com.be.utils.CheckUserUtil;

/**
 * 页面跳转servlet
 * @author blindeagle
 * @version 1.0
 * date 2015-12-04
 */
@WebServlet(name="PageForwardServlet", urlPatterns="/servlet/PageForwardServlet")
public class PageForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<NormalWebSubject> norWebSubs = null;
	private List<NormalWeb> norWebs = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		CharEncodingUtil.setEncodingUTF8(request, response);
		
		String type = request.getParameter("type");
		
		switch (type) {
		case "toNormalWebShow" : toNormalWebShow(request, response); break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	/**
	 * 跳转到常用网站展示页面
	 * @author blindeagle
	 * @param request 请求对象
	 * @param response 响应对象
	 * @return void
	 */
	private void toNormalWebShow(HttpServletRequest request, HttpServletResponse response) {
		norWebSubs = new NormalWebSubjectServiceImpl().queryAllNorWebSub();
		norWebs = new NormalWebServiceImpl().queryNorWebBySubId(norWebSubs.get(0).getNorWebSubId());
		try {
			request.setAttribute("norWebSubs", norWebSubs);
			request.setAttribute("norWebs", norWebs);
			String path = "";
			if ("yes".equals(CheckUserUtil.checkAdmin(request))) {
				path = "/WEB-INF/jsp/admin/NormalWebShow.jsp";
			} else {
				path = "/WEB-INF/jsp/guest/NormalWebShow.jsp";
			}
			request.getRequestDispatcher(path).forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

}
