package com.pandorabox.domain;

import java.io.Serializable;

/**
 * User对象用来描述系统的注册用户
 * 
 * @author hywang
 * */
public interface User extends Serializable{
	
	/**
	 * 用户名
	 */
	public String getUserName();
	public void setUserName(String userName);
	
	/**
	 * 密码
	 */
	public String getPasswd();
	public void setPasswd(String passWd);
	
	/**
	 * 真实姓名
	 */
	public String getName();
	public void setName(String name);
	
	/**
	 * 注册邮箱
	 */
	public String getEmail();
	public void setEmail(String email);
}
