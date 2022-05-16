package com.inhatc.domain;


public class StudentInfoVO {
	private String sid;
	private String sname;
	private String sadd;
	private String sphone;
	private String semail;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	@Override
	public String toString() {
		return "StudentInfoVO [sid=" + sid + ", sname=" + sname + ", sadd=" + sadd + ", sphone=" + sphone + ", semail="
				+ semail + "]";
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	
}
