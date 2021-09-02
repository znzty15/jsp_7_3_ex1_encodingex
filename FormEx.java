package com.javayongju.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEx
 */
@WebServlet("/FormEx")
public class FormEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet 메소드가 실행되었습니다.");
	}
일단 이거 끝나고 ㄱㄱ
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("doPost 메소드가 실행되었습니다.");
		
		request.setCharacterEncoding("EUC-KR");
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	String[] hobbys = request.getParameterValues("hobby");
	//취미는 여러개의 값을 가져오기 때문에 배열로 선언하고 getParameterValues 메소드로 받아온다.
	String major = request.getParameter("major");
	String protocol = request.getParameter("protocol");
	
	response.setContentType("text/html; charset=EUC-KR");
	PrintWriter writer = response.getWriter();
	writer.println("<html><head></head><body>");
	writer.println("안녕하세요."+name+"님 반갑습니다."+"<br/><br/>");
	writer.println("입력하신 아래의 가입정보를 확인하시기 바랍니다.<br/><br/><br/>");
	
	
	writer.println("이름 : "+name+"<br/>");
	writer.println("아이디 : "+id+"<br/>");
	writer.println("비밀번호 : "+pw+"<br/>");
	
	
	writer.println("비밀번호 : "+Arrays.toString(hobbys)+"<br/>");//배열값을 문자열로 받음
	writer.println("전공 : "+major+"<br/>");
	writer.println("포로토콜 : "+protocol+"<br/>");

	writer.println("</body></html>");
	
	writer.close();
	
	}

}
