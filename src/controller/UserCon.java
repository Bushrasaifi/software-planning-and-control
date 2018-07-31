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
import Pojo.user;



/**
 * Servlet implementation class User
 */
@WebServlet("/UserCon")
public class UserCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * 
	 */
	public UserCon() {
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
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String uUsername=request.getParameter("uUsername");
		String uemail=request.getParameter("uemail");
		String dob=request.getParameter("dob");
		String uaddress=request.getParameter("uaddress");
		String upass=request.getParameter("upass");
		String ucity=request.getParameter("ucity");
		user us=new user(uname,uUsername,uemail,dob,uaddress,upass,ucity);
		DAOdemo db=new daoImple();
		if(db.saveData(us))
		{
			
	pw.print("<center>register succesfully..</center>");
	request.getRequestDispatcher("userLogin.jsp").include(request, response);
		}
		else
		{
			pw.print("<center>Failed to register...</center>");
			
		}
		
	}

}
