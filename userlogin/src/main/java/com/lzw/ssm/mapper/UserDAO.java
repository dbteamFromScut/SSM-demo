package com.lzw.ssm.mapper;

import com.lzw.ssm.user.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {
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
    public int updatePassword(@Param(value="password")String password, @Param(value="id")String id);

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
