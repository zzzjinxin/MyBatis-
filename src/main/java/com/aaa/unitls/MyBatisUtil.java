package com.aaa.unitls;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    /**
     * 创建工具类，避免每次sqlsesionfactory被多次创建
     */
    static String resource="mybatis-cfg.xml";
    static SqlSessionFactory sessionFactory;
    static InputStream inputStream;
    static {
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //创建sqlsession
    public static SqlSession getSqlsession(){
        //opensession
       return sessionFactory.openSession();
    }
    //关闭连接
    public static void  getSqlSessionClose(SqlSession sqlSession){
        if (sqlSession!=null){
            sqlSession.close();
        }
    }
}
