package Pojo;

import java.sql.Blob;
import java.util.Set;

public class projects {
	

	private int pid;
	private String ptech;
	private String pname;
	private Blob  pimages;
	private Blob pfiles;
	
	
	
	public projects() {
		// TODO Auto-generated constructor stub
	}


	public projects(String ptech, String pname, Blob pimages, Blob pfiles) {
		super();
		this.ptech = ptech;
		this.pname = pname;
		this.pimages = pimages;
		this.pfiles = pfiles;
	}


	public int getPid() {
		return pid;
	}




	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPtech() {
		return ptech;
	}


	public void setPtech(String ptech) {
		this.ptech = ptech;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}








	public Blob getPimages() {
		return pimages;
	}








	public void setPimages(Blob pimages) {
		this.pimages = pimages;
	}








	public Blob getPfiles() {
		return pfiles;
	}








	public void setPfiles(Blob pfiles) {
		this.pfiles = pfiles;
	}


	
	
	
}
