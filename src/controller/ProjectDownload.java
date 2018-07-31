package controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAOdemo;
import DAOimpl.daoImple;
import Pojo.projects;

/**
 * Servlet implementation class ProjectDownload
 */
@WebServlet("/ProjectDownload")
public class ProjectDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int BUFFER_SIZE = 4096;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectDownload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param BUFFER_SIZE 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int pid=Integer.parseInt(request.getParameter("param"));
		System.out.println(pid);
		DAOdemo db=new daoImple();
		List<projects> result=db.getProjectsDetailsById(pid);
		
		for(projects pr:result) {
		try {
		String filename=pr.getPname();
		Blob blob=pr.getPfiles();
		 InputStream is = blob.getBinaryStream();
		int fileLength =  is.available();
        
        System.out.println("fileLength = " + fileLength);

        ServletContext context = getServletContext();

        // sets MIME type for the file download
        String mimeType = context.getMimeType(filename);
        if (mimeType == null) {        
            mimeType = "application/octet-stream";
                   
        
        // set content properties and header attributes for the response
        response.setContentType(mimeType);
        response.setContentLength(fileLength);
        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=\"%s\"", filename);
        response.setHeader(headerKey, headerValue);

        // writes the file to the client
        OutputStream outStream = response.getOutputStream();
         
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead = -1;
         
        while ((bytesRead = is.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }
         
        is.close();
        outStream.close();             
    } else {
        // no file found
        response.getWriter().print("File not found for the id: " + pid);  
    }
}   catch (IOException ex) {
    ex.printStackTrace();
    response.getWriter().print("IO Error: " + ex.getMessage());
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
