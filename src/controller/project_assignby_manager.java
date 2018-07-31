package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import DAO.DAOdemo;
import DAOimpl.daoImple;
import Pojo.assign;
import Pojo.contact;
import Pojo.employee;

/**
 * Servlet implementation class project_assignby_manager
 */
@WebServlet("/project_assignby_manager")
public class project_assignby_manager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public project_assignby_manager() {
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
		int eid=Integer.parseInt(request.getParameter("eid"));
		int aid=Integer.parseInt(request.getParameter("aid"));
		
		System.out.println(eid+"\t"+aid);
		
		DAOdemo dd=new daoImple();
		if(dd.getAllAssignUpdate(aid, eid)!=0)
		{
			//request.getRequestDispatcher("AssignProject.jsp").forward(request, response);
		}
		else {
			pw.print("<center> assignment failed!! try again</center>");
		}
	}
}
