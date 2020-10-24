package com.atguigu.springboot.dao;

import com.atguigu.springboot.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

//DAO继承JpaRepository接口   那么这个接口中就有基本的crud操作了
public interface UserDao extends JpaRepository<User,Integer> {
}
