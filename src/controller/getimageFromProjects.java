package controller;

import java.io.IOException;
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

import Pojo.assign;
import Pojo.projects;
import Util.HibernateUtil;

/**
 * Servlet implementation class getimageFromProjects
 */
@WebServlet("/getimageFromProjects")
public class getimageFromProjects extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getimageFromProjects() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pid=Integer.parseInt(request.getParameter("pid"));
		System.out.println();
		
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "From projects as a where a.pid=?";		
		Query query = session.createQuery(hql);
		query.setParameter(0, pid);
		List<projects> results = query.list();
			//Blob image=(Blob)request.getAttribute("immg");
		 for(projects aa:results)
		 {
			Blob image=aa.getPimages();
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