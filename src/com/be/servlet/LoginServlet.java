package com.be.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.be.utils.CharEncodingUtil;

/**
 * 登录servlet
 * @author blindeagle
 * @version 1.0
 * date 2015-12-04
 */
@WebServlet(name="LoginServlet", urlPatterns="/servlet/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		CharEncodingUtil.setEncodingUTF8(request, response);
		
		String type = request.getParameter("type");
		
		switch (type) {
		case "checkUser" : checkUser(request, response); break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	/**
	 * 检验管理员
	 * @author blindeagle
	 * @param request 请求对象
	 * @param response 响应对象
	 * @return void
	 */
	private void checkUser(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if ("blindeagle".equals(username) && "dshb(2430168648)".equals(password)) {
			request.getSession().setAttribute("username", username);
			try {
				request.getRequestDispatcher("/servlet/PageForwardServlet?type=toNormalWebShow").forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				request.getRequestDispatcher("www.baidu.com").forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		}
	}

}
