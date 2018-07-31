package Pojo;

import java.util.Set;

public class employee {
	  
	private int Empid; 
	private String Ename;
	private String Eemail;
	private String Epassword;
	private String Eaddress;
	private int Eage ;
	private String EQualification;
	private Set<assign> assignid;
	
	
	

	public employee( int empid ,String ename,String eemail, String epassword, String eaddress, int eage,
			String eQualification) {
		super();
		Empid=empid;
		Ename = ename;
		Eemail = eemail;
		Epassword = epassword;
		Eaddress = eaddress;
		
		Eage = eage;
		EQualification = eQualification;
	}

	public employee(String ename,String eemail, String epassword, String eaddress, int eage,
			String eQualification) {
		super();
		
		Ename = ename;
		Eemail = eemail;
		Epassword = epassword;
		Eaddress = eaddress;
		
		Eage = eage;
		EQualification = eQualification;
	}
	
	
	
	public Set<assign> getAssignid() {
		return assignid;
	}

	public void setAssignid(Set<assign> assignid) {
		this.assignid = assignid;
	}

	public employee(String ename, String eemail, String epassword, String eaddress, int eage, String eQualification,
			Set<assign> assignid) {
		super();
		Ename = ename;
		Eemail = eemail;
		Epassword = epassword;
		Eaddress = eaddress;
		Eage = eage;
		EQualification = eQualification;
		this.assignid = assignid;
	}

	public employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

	

	
	
	




	public String getEemail() {
		return Eemail;
	}



	public void setEemail(String eemail) {
		Eemail = eemail;
	}



	public int getEmpid() {
		return Empid;
	}



	public void setEmpid(int empid) {
		Empid = empid;
	}



	public String getEname() {
		return Ename;
	}



	public void setEname(String ename) {
		Ename = ename;
	}



	public String getEpassword() {
		return Epassword;
	}



	public void setEpassword(String epassword) {
		Epassword = epassword;
	}



	public String getEaddress() {
		return Eaddress;
	}



	public void setEaddress(String eaddress) {
		Eaddress = eaddress;
	}







	public int getEage() {
		return Eage;
	}



	public void setEage(int eage) {
		Eage = eage;
	}



	public String getEQualification() {
		return EQualification;
	}



	public void setEQualification(String eQualification) {
		EQualification = eQualification;
	}
	
	
	

}
