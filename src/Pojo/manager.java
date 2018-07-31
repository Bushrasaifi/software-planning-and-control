package Pojo;

public class manager {
	private int mid;
	private String mname;
	

	private String memail;
	private String mpass;
	
	
	public manager() {
		
	}
	/**
	 * @param mname
	 * @param memail
	 * @param mpass
	 */
	public manager(String mname, String memail, String mpass) {
		super();
		this.mname = mname;
		this.memail = memail;
		this.mpass = mpass;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getMpass() {
		return mpass;
	}
	public void setMpass(String mpass) {
		this.mpass = mpass;
	}
	
	

}
