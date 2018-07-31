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
import Pojo.assign;

/**
 * Servlet implementation class deleteAssign
 */
@WebServlet("/deleteAssign")
public class deleteAssign extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteAssign() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		assign as=new assign();
		DAOdemo dd=new daoImple();
		if(dd.deleteFrmAssign(as)==1)
		{
			
			request.getRequestDispatcher("AssignProject.jsp").include(request, response);
		}
		else
		{
			pw.print("failed!");
			request.getRequestDispatcher("AssignProject.jsp").include(request, response);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
