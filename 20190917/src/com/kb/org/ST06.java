package com.kb.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ST06")
public class ST06 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ST06() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if(name.equals("admin")&&password.equals("1234")) {
		PrintWriter out = response.getWriter();
		out.println("<h3>로그인을 환영합니다.<h3/>");
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("<h3>아이디나 비밀번호가 일치하지 않습니다.<h3/>");
		}		
	}
}
