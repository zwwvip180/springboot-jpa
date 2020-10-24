package com.atguigu.springboot.service;

import com.atguigu.springboot.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findUsers();

    User findUserById(Integer id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Integer id);
}
