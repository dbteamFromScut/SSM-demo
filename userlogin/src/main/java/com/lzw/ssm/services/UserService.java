package com.lzw.ssm.services;

import com.lzw.ssm.user.User;

import java.util.List;

public interface UserService {

    /**
     * 新增用户
     */
    public int addUser(User user);

    /**
     * 获取所有用户
     *
     */
    public List<User> getUsers();

    /**
     * 以id获取用户
     *
     */
    public User getUserById(String id);

    /**
     * 更改密码
     *
     */
    public int updatePassword(String password,String id);

    /**
     * 获取id密码并验证
     *
     */
    public String getPassword(String id);

    /**
     * 检测用户id是否已存在
     *
     *
     */
    public int check(String id);
}
