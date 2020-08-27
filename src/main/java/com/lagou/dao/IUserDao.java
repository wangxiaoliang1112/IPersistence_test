package com.lagou.dao;

import com.lagou.pojo.User;

import java.util.List;

public interface IUserDao {

    public List<User> findAll();

    public User findAllCondition(User user);


    //新增用户
    public void insertUser(User user);

    //修改用户
    public int updateUser(User user);

    //删除用户
    public int deleteUser(User user);

}
