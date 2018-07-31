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
import Pojo.employee;
import Pojo.user;

/**
 * Servlet implementation class EmployeeConLogin
 */
@WebServlet("/EmployeeConLogin")
public class EmployeeConLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeConLogin() {
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
		String name=request.getParameter("name");
		String password=request.getParameter("pass");		
		employee em=new employee();
		em.setEname(name); 
		em.setEpassword(password);
		DAOdemo dd=new daoImple();
		if(dd.CheckIdEmp(em)==1)
		{
			request.getRequestDispatcher("employeePage.jsp").forward(request, response);

		}
		else
		{    pw.print("login fail!");
			request.getRequestDispatcher("employeeLogin.jsp").include(request, response);

		}
	}

}
