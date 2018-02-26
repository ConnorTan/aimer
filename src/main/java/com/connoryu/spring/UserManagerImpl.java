package com.connoryu.spring;

public class UserManagerImpl implements UserManager{

	public void addUser(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("-------------userManager.add()----------");
	}

	public void delUser(int userId) {
		// TODO Auto-generated method stub
		System.out.println("-------------userManager.delUser()-------------");
	}

	public String findUserById(int userId) {
		// TODO Auto-generated method stub
		System.out.println("--------------userManager.findUserById()-----------------");
		return "张三";
	}

	public void modifyUser(int userId, String username, String passwordString) {
		// TODO Auto-generated method stub
		System.out.println("-----------------userManager.modifyUser-------------------");
	}

	
}
