package com.connoryu.controllor;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.connoryu.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserService userSerivce;
	
	@RequestMapping(value="/select",method= RequestMethod.GET)
	public String selectUser(HttpServletRequest request,HttpServletResponse response){
		
		return "index";
	}
}
