package Pojo;

public class user {
	private int uid;
	private String uname;
	private String uUsername;
	private String uemail;
	private String dob;
	private String uaddress;
	private String upass;
	
	private String  ucity;

	public user(String uname, String uUsername, String uemail, String dob, String uaddress, String upass,
			String ucity) {
		super();
		this.uname = uname;
		this.uUsername = uUsername;
		this.uemail = uemail;
		this.dob = dob;
		this.uaddress = uaddress;
		this.upass = upass;
		this.ucity = ucity;
	}

	public user() {
		// TODO Auto-generated constructor stub
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getuUsername() {
		return uUsername;
	}

	public void setuUsername(String uUsername) {
		this.uUsername = uUsername;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getUcity() {
		return ucity;
	}

	public void setUcity(String ucity) {
		this.ucity = ucity;
	}
	
		

	

	

}
