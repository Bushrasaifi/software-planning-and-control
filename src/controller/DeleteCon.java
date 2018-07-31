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
 * Servlet implementation class DeleteCon
 */
@WebServlet("/DeleteCon")
public class DeleteCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCon() {
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
		int eid=Integer.parseInt(request.getParameter("eid"));
		employee em=new employee();
		em.setEmpid(eid);
		DAOdemo db=new daoImple();
		if(db.deleteById(em)==1)
		{
			request.setAttribute("delete", "del");
			request.getRequestDispatcher("managerPage.jsp").include(request, response);			
			
		}
		else {
			
			request.setAttribute("delete", "fail");
			request.getRequestDispatcher("managerPage.jsp").include(request, response);	
			
		}
	}

}
