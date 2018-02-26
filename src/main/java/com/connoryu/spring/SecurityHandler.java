package com.connoryu.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityHandler implements InvocationHandler {

	private Object targetObject;

	public Object createProxyInstanceObject(Object targetObject) {
		this.targetObject = targetObject;
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(),
				this);

	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		checkSecurity();
		
		Object ret = method.invoke(targetObject, args);
		
		return ret;
	}
	
	public void checkSecurity(){
		System.out.println("----------------checkSecurity--------------");
	}

}
