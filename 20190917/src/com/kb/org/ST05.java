package com.kb.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ST05")
public class ST05 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ST05() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charset=UTF-8");
		response.setCharacterEncoding("utf-8");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charset=UTF-8");
		response.setCharacterEncoding("utf-8");
				
		String name = request.getParameter("name");
		
		System.out.println("name : "+ name);
		
		PrintWriter out = response.getWriter();
		out.println(" <h3>이 요청은 doPost 에서 처리되었습니다</h3>");
		out.println("<h2>name : ["+ name + "]</h2>");
		
	}

}
