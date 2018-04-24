package com.wanyu.Service;

import com.wanyu.Config.MybatisUtil;
import com.wanyu.Mapper.IFatherDao;
import com.wanyu.model.Father;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by wanyu on 2018/4/3.
 */
public class FatherMapperImpl {
   private static MybatisUtil mybatisUtil;
   public static SqlSession session;
    public FatherMapperImpl(){
        mybatisUtil=new MybatisUtil();
        session=mybatisUtil.openSession();
    }
    @Test
    public void addFather(){
        IFatherDao fatherDao=session.getMapper(IFatherDao.class);
        Father father=new Father();
        father.setName("china");
        father.setAge(100);
        fatherDao.addFather(father);
        session.commit();
    }
    @Test
    public void selectFatherList(){
        IFatherDao fatherdao=session.getMapper(IFatherDao.class);
       Iterator<Father> it= fatherdao.getFatherList().iterator();
        Father father;
        while(it.hasNext()){
            father=it.next();
            System.out.println(father.getName()+" "+father.getAge());
        }
    }
}
