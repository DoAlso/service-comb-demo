package com.servicecomb.springboot.msaccount.model.param;

import java.io.Serializable;

public class LoginParam implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String account;//账号
	private String password;//密码
	private String yzm;//验证码
	private String msgauthcode;//短信验证码
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getYzm() {
		return yzm;
	}
	public void setYzm(String yzm) {
		this.yzm = yzm;
	}
	public String getMsgauthcode() {
		return msgauthcode;
	}
	public void setMsgauthcode(String msgauthcode) {
		this.msgauthcode = msgauthcode;
	}
	
}
