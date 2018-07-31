package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAOdemo;
import DAOimpl.daoImple;
import Pojo.manager;

/**
 * Servlet implementation class Manager
 */
@WebServlet("/ManagerCon")
public class ManagerCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    

	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ManagerCon() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String mname=request.getParameter("mname");
		String memail=request.getParameter("memail");
		String mpass=request.getParameter("mpass");
		
		manager ad=new manager( mname,memail,mpass);
		DAOdemo dd=new daoImple();
		if(dd.verify(ad)) {
			request.getRequestDispatcher("managerPage.jsp").forward(request, response);
			
		}
		else
		{
			pw.print("<center>login failed!!...</center>");
			request.getRequestDispatcher("managerLogin.jsp").forward(request, response);
			
		}
	}

}
