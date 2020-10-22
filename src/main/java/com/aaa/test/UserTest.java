package com.aaa.test;

import com.aaa.dao.UserDao;
import com.aaa.entity.User;
import com.aaa.unitls.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

public class UserTest {
    @Test
public  void findByNameRole(){
    SqlSession sqlsession = MyBatisUtil.getSqlsession();
    UserDao userDao = sqlsession.getMapper(UserDao.class);
    User u=new User();
    u.setUserName(null);
   u.setUserRole(null);
    List<User> nameRole = userDao.findByNameRole(u);
    for (User user:nameRole
         ) {
        System.out.println(user.getUserCode());
        System.out.println(user.getUserName());
        System.out.println(user.getUserRole());
    }
    MyBatisUtil.getSqlSessionClose(sqlsession);

}
    @Test
    public  void findByNameRoleTwo(){
        SqlSession sqlsession = MyBatisUtil.getSqlsession();
        UserDao userDao = sqlsession.getMapper(UserDao.class);
        User u=new User();
        u.setUserName(null);
        u.setUserRole(3);
        List<User> nameRole = userDao.findByNameRoleTwo(u);
        for (User user:nameRole
        ) {
            System.out.println(user.getUserName());
            System.out.println(user.getUserRole());
        }
        MyBatisUtil.getSqlSessionClose(sqlsession);

    }
    @Test
    public  void update(){
        SqlSession sqlsession = MyBatisUtil.getSqlsession();
        UserDao mapper = sqlsession.getMapper(UserDao.class);
        User u=new User();
        u.setUserCode("wangwu");
        u.setUserName("李四");
        u.setAddress(null);
        u.setId(40);
        int i = mapper.update(u);
        sqlsession.commit();
        if (i==1){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        MyBatisUtil.getSqlSessionClose(sqlsession);
    }
    @Test
    public  void updateTwo(){
        SqlSession sqlsession = MyBatisUtil.getSqlsession();
        UserDao mapper = sqlsession.getMapper(UserDao.class);
        User u=new User();
        u.setUserCode(null);
        u.setUserName("小明");
        u.setAddress(null);
        u.setId(40);
        int i = mapper.update(u);
        sqlsession.commit();
        if (i==1){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        MyBatisUtil.getSqlSessionClose(sqlsession);
    }
}
