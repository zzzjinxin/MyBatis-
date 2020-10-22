package com.aaa.dao;

import com.aaa.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface UserDao {
    //查询用户名和角色名存在的用户信息
    public List<User> findByNameRole(User user);
    //查询用户名和角色名存在的用户信息
    public List<User> findByNameRoleTwo(User user);
    //修改用户信息
    public  int update(User user);
    //修改用户信息
    public  int updateTwo(User user);

}
