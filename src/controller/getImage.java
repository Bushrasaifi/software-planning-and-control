package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;

import DAO.DAOdemo;
import DAOimpl.daoImple;
import Pojo.assign;
import Util.HibernateUtil;

/**
 * Servlet implementation class getImage
 */
@WebServlet("/getImage")
public class getImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getImage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("rawtypes")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int aid=Integer.parseInt(request.getParameter("aid"));
		System.out.println();
		
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "From assign as a where a.aid=?";		
		Query query = session.createQuery(hql);
		query.setParameter(0, aid);
		List<assign> results = query.list();
			//Blob image=(Blob)request.getAttribute("immg");
		 for(assign aa:results)
		 {
			Blob image=aa.getImage();
			byte[] imga;
			try {
				imga = image.getBytes(1, (int) image.length());
				response.setContentType("image/gif");
				OutputStream os=response.getOutputStream();
				//FileOutputStream fos=new FileOutputStream("C:\\Users\\user\\eclipse-workspace\\PPC\\WebContent\\images\\picture\\"+name+".jpg");
				os.write(imga);
				os.flush();
				os.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
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
