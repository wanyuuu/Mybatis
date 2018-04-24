package com.wanyu.Service;

import com.wanyu.Config.MybatisUtil;
import com.wanyu.Mapper.ISonDao;
import com.wanyu.model.Son;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by wanyu on 2018/4/3.
 */
public class SonMapperImpl {
    private static MybatisUtil mybatisUtil;
    private static SqlSession sqlSession;
    public SonMapperImpl(){
        mybatisUtil=new MybatisUtil();
        sqlSession=mybatisUtil.openSession();
    }
    @Test
    public void getSonList(){
        ISonDao iSonDao=sqlSession.getMapper(ISonDao.class);
        Iterator<Son> it=iSonDao.getSonList("wanyu").iterator();
        Son son;
        while(it.hasNext()){
            son=it.next();
            System.out.println(son.getSname()+" "+son.getAge());
        }
    }
}
