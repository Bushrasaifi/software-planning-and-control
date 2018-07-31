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

/**
 * Servlet implementation class EmployeeConUpdate
 */
@WebServlet("/EmployeeConUpdate")
public class EmployeeConUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeConUpdate() {
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
		int id=Integer.parseInt(request.getParameter("ID"));
		String name=request.getParameter("ename");
		String email=request.getParameter("eemail");
		String pass=request.getParameter("epass");
		String address=request.getParameter("eaddress");
		
		int age=Integer.parseInt(request.getParameter("eage"));
		String qualification=request.getParameter("equalification");
		employee em=new employee(id,name,email,pass,address,age,qualification);
		DAOdemo db=new daoImple();
		if(db.updateData(em)==1)
		{
			request.getRequestDispatcher("managerPage.jsp").include(request, response);
			
		}
		else
		{
			pw.print("<center>failed!!</center>");
			
			request.getRequestDispatcher("employeeRegister.jsp").include(request, response);
			
		}
	}

}
