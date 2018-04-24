package com.wanyu.Config;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by wanyu on 2018/3/21.
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;

    public  MybatisUtil(){
        String resource="mybatis.cfg.xml";
        InputStream is=this.getClass().getClassLoader().getResourceAsStream(resource);
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
//        System.out.println(MybatisUtil.class.getResource("/"));
//        System.out.println(MybatisUtil.class.getResource(""));
//        System.out.println(this.getClass().getClassLoader().getResource("/"));
//        System.out.println(this.getClass().getClassLoader().getResource(""));
    }
    public static SqlSession openSession(){
        return sqlSessionFactory.openSession();
    }
}
