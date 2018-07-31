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
import Pojo.review;

/**
 * Servlet implementation class ReviewCon
 */
@WebServlet("/ReviewCon")
public class ReviewCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewCon() {
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
		String msg=request.getParameter("message");
		review ad=new review( name,msg);
		DAOdemo dd=new daoImple();
		if(dd.saveData(ad))
		{
			request.getRequestDispatcher("userPage.jsp").include(request, response);
		}
		else
		{
			request.getRequestDispatcher("feedback.jsp").include(request, response);
		}
	}

}
