package com.connoryu.spring;

/**
 * 要实现的接口
 * @author Administrator
 *
 */
public interface UserManager {
	
	public void addUser(String username,String password);
	
	public void delUser(int userId);
	
	public String findUserById(int userId);
	
	public void modifyUser(int userId,String username,String passwordString);
}
