package com.kb.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ST07")
public class ST07 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ST07() {
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
		String gender = request.getParameter("gender");
		String id = request.getParameter("id");
		String address = request.getParameter("address");
		String phone_number = request.getParameter("phone_number");
		String email_address = request.getParameter("email_address");
		String[] hobby = request.getParameterValues("hobby");

		PrintWriter out = response.getWriter();
		out.println("<h3>작성하신 내용은 아래와 같습니다</h3>");
		out.println("이름 : "+ name + "<hr/>");
		out.println("성별 : "+ gender + "<hr/>");
		out.println("아이디 : "+ id + "<hr/>");
		out.println("주소 : "+ address + "<hr/>");
		out.println("전화번호 : "+ phone_number + "<hr/>");
		out.println("이메일주소 : "+ email_address + "<hr/>");
		
		if(hobby == null) {
			out.println("취미:<br/>");
			out.println("[선택한 취미가 없습니다]");
		}else {
			out.println("취미:");
			out.println(" <table border=\"1\">");
			for(int i=0; i<hobby.length;i++) {				
				out.println("  <tr>");
				out.println("    <td width=\"80\" align=\"center\">");
				out.println(hobby[i]);
				out.println("    </td>");
				out.println("   </tr>");
			}
		}
		out.println("     </table>");
		
	}

}
