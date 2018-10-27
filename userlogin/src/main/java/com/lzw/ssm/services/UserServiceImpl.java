package com.lzw.ssm.services;


import com.lzw.ssm.mapper.UserDAO;
import com.lzw.ssm.user.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    UserDAO userDao;

    @Override
    public int addUser(User user){
        return userDao.addUser(user);
    };

    @Override
    public List<User> getUsers(){
        return userDao.getUsers();
    };

    @Override
    public User getUserById(String id){
        return userDao.getUserById(id);
    };

    @Override
    public int updatePassword(String password,String id){
        return userDao.updatePassword(password,id);
    };

    @Override
    public String getPassword(String id){
        return userDao.getPassword(id);
    };

    @Override
    public int check(String id){
      return userDao.check(id);
    };

}
