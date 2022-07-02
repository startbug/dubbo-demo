package com.ggs.service;


import com.ggs.pojo.User;

public interface UserService {

    String sayHello();

    /**
     * 查询用户
     */
    User findUserById(int id);

}
