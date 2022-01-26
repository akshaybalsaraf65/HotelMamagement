package beanpojo;

public class user {
	private int id;
	private String fn;
	private String ln;
	private String mob;
	private String usern;
	private String pass;
	private String cpass;
	private String active;
	private String createdate;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getUsern() {
		return usern;
	}
	public void setUsern(String usern) {
		this.usern = usern;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public user() {
		super();
	}
	public user(int id, String fn, String ln, String mob, String usern,
			String pass, String cpass, String active, String createdate) {
		super();
		this.id = id;
		this.fn = fn;
		this.ln = ln;
		this.mob = mob;
		this.usern = usern;
		this.pass = pass;
		this.cpass = cpass;
		this.active = active;
		this.createdate = createdate;
	}
	
	
	
	
	
}
