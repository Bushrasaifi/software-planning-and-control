package Pojo;

public class review {


	private int rid;
	private String rname;
	private String msg;
	
	
	public review() {
		
	}
	/**
	 * @param rname
	 * @param msg
	 */
	public review(String rname, String msg) {
		super();
		this.rname = rname;
		this.msg = msg;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
