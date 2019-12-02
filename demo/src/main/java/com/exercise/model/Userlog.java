package com.exercise.model;

public class Userlog {
	
	private String userid;
	private String sessionid;
	private String actions;
	
	
	public Userlog(String userid, String sessionid, String actions) {
		super();
		this.userid = userid;
		this.sessionid = sessionid;
		this.actions = actions;
	}
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	
	
	public String getActions() {
		return actions;
	}
	public void setActions(String actions) {
		this.actions = actions;
	}
	
	
	
	

}
