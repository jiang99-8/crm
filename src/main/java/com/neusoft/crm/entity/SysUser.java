package com.neusoft.crm.entity;

public class SysUser {
	private int userId;
	private String userName;
	private String userPassword;
	private int daId;
	private int userRoleId;
	private int userFlag;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getDaId() {
		return daId;
	}
	public void setDaId(int daId) {
		this.daId = daId;
	}
	public int getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	public int getUserFlag() {
		return userFlag;
	}
	public void setUserFlag(int userFlag) {
		this.userFlag = userFlag;
	}
	

}
