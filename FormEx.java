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
		System.out.println("doGet �޼ҵ尡 ����Ǿ����ϴ�.");
	}
�ϴ� �̰� ������ ����
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("doPost �޼ҵ尡 ����Ǿ����ϴ�.");
		
		request.setCharacterEncoding("EUC-KR");
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	String[] hobbys = request.getParameterValues("hobby");
	//��̴� �������� ���� �������� ������ �迭�� �����ϰ� getParameterValues �޼ҵ�� �޾ƿ´�.
	String major = request.getParameter("major");
	String protocol = request.getParameter("protocol");
	
	response.setContentType("text/html; charset=EUC-KR");
	PrintWriter writer = response.getWriter();
	writer.println("<html><head></head><body>");
	writer.println("�ȳ��ϼ���."+name+"�� �ݰ����ϴ�."+"<br/><br/>");
	writer.println("�Է��Ͻ� �Ʒ��� ���������� Ȯ���Ͻñ� �ٶ��ϴ�.<br/><br/><br/>");
	
	
	writer.println("�̸� : "+name+"<br/>");
	writer.println("���̵� : "+id+"<br/>");
	writer.println("��й�ȣ : "+pw+"<br/>");
	
	
	writer.println("��й�ȣ : "+Arrays.toString(hobbys)+"<br/>");//�迭���� ���ڿ��� ����
	writer.println("���� : "+major+"<br/>");
	writer.println("�������� : "+protocol+"<br/>");

	writer.println("</body></html>");
	
	writer.close();
	
	}

}
