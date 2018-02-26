package com.connoryu.spring;

public class Client {
	public static void main(String[] args) {
		SecurityHandler handler = new SecurityHandler();

		UserManager userManager =  (UserManager) handler.createProxyInstanceObject(new UserManagerImpl());
	
		userManager.addUser("zhangsan", "123");
	}
}
