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
 * Servlet implementation class UserConLogin
 */
@WebServlet("/UserConLogin")
public class UserConLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserConLogin() {
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
		String username=request.getParameter("username");
		String password=request.getParameter("upass");		
		user us=new user();
		us.setuUsername(username);
		us.setUpass(password);
		DAOdemo dd=new daoImple();
		if(dd.CheckId(us)==1)
		{
			request.getRequestDispatcher("userPage.jsp").forward(request, response);

		}
		else
		{    pw.print("login failed!");
			request.getRequestDispatcher("userLogin.jsp").forward(request, response);

		}
	}

}
