package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAOdemo;
import DAOimpl.daoImple;
import Pojo.assign;
import Pojo.employee;

/**
 * Servlet implementation class Emplink_assignProject
 */
@WebServlet("/Emplink_assignProject")
public class Emplink_assignProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Emplink_assignProject() {
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
		employee id=(employee) request.getAttribute("id");
		DAOdemo dd=new daoImple();
		if(dd.getAllAssignById(id)!=null)
		{    
			List<assign> results=dd.getAllAssignById(id);
			request.setAttribute("result", results);
			request.getRequestDispatcher("viewAssignedProject.jsp").forward(request, response);
		}
		else {
			pw.print("<center>No project!</center>");
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
