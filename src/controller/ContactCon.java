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
import Pojo.contact;

/**
 * Servlet implementation class contact
 */
@WebServlet("/ContactCon")
public class ContactCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  /**
     * @see HttpServlet#HttpServlet()
     */

	public ContactCon() {
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
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String uname=request.getParameter("name");
		pw.print("hello");
		String uemail=request.getParameter("email");
		String subject=request.getParameter("subject");
		String message=request.getParameter("message");
		contact ad=new contact(uname,uemail,subject,message);
		DAOdemo dd=new daoImple();
		if(dd.saveData(ad)) {
			pw.print("<center>query send succesfully..</center>");
			
		}
		else
		{
			pw.print("<center>Failed to send...</center>");
			    
		}
		
	}

}
