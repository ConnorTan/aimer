package com.connoryu.dao;

import java.util.Map;

import com.connoryu.entity.User;


public interface UserDao{
    User selectUser(String username);
}