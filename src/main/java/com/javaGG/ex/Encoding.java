package com.javaGG.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Encoding
 */
@WebServlet("/Encoding")
public class Encoding extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Encoding() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("GET 방식으로 실행");
		
		String name = request.getParameter("name");
		response.setContentType("text/html; charset=EUC-KR");
		
		PrintWriter wt = response.getWriter();
		wt.println("<html><head></head><body>");
		wt.println(name + "님 하이");
		wt.println("</body></html>");
		
		wt.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		System.out.println("POST 방식으로 실행");
		
		request.setCharacterEncoding("EUC-KR");
		
		String name = request.getParameter("name");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter wt = response.getWriter();
		
		wt.println("<html><head></head><body>");
		wt.println(name + "님 하이");
		wt.println("</body></html>");
		
		wt.close();
	}

}
