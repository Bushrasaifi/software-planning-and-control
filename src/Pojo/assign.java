package Pojo;

import java.sql.Blob;

import org.hibernate.mapping.Set;

public class assign {
	
	private int aid;
	private String name;
	private Blob image;
	private employee empid;
	
	
	public assign() {
		// TODO Auto-generated constructor stub
	}
	
	
	public assign(String name, Blob image) {
		super();
		this.name = name;
		this.image = image;
	}

	public assign(String name, Blob image, employee empid) {
		super();
		this.name = name;
		this.image = image;
		this.empid = empid;
	}

	
	public employee getEmpid() {
		return empid;
	}


	

	public void setEmpid(employee empid) {
		this.empid = empid;
	}


	
	
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	
	
	
	
	

}
