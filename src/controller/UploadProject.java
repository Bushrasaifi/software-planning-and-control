package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import DAO.DAOdemo;
import DAOimpl.daoImple;

import Pojo.projects;

/**
 * Servlet implementation class UploadProject
 */
@WebServlet("/UploadProject")
public class UploadProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String UPLOAD_DIRECTORY = "E:/abc";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadProject() {
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
	
		if(ServletFileUpload.isMultipartContent(request)) {
			
			try {
				
				List<FileItem> multiparts= new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
				for(FileItem item :multiparts)
				{
					if(!item.isFormField()) {
						
						String name= new File(item.getName()).getName();
						item.write(new File(UPLOAD_DIRECTORY +File.separator +name));
					}
				}
			}catch(Exception ex)
			{
				
			}
		}
		
		
		
		
	}

}
