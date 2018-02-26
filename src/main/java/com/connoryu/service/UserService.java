package com.connoryu.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.connoryu.dao.UserDao;
import com.connoryu.entity.User;

@Service("userService")
@Transactional
public class UserService{
    
    @Autowired
    private UserDao userDao;
    
    public User getUserByUsername(String username){
    	User user =userDao.selectUser(username);
    	return user;
    }
}