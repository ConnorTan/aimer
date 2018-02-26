package com.connoryu.utiliy;

public class Singleton {
	private Singleton(){};	//私有构造器
	private static Singleton instance = new Singleton();//创建静态对象
	public static  Singleton getInstatic(){		//调用方法则返回对象
		return instance;
	}
}
