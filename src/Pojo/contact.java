package Pojo;

public class contact {

	
	private int uid;
	private String uname;
	private String uemail;
	private String subject;
	private String message;
	
	public contact()
	{
		
	}
	public contact(String uname, String uemail, String subject, String message) {
		super();
		
		this.uname = uname;
		this.uemail = uemail;
		this.subject = subject;
		this.message = message;
	}
	
	public String getUname() {	
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}
	
	
	
}
