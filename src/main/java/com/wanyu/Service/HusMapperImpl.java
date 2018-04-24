package com.wanyu.Service;

import com.wanyu.Config.MybatisUtil;
import com.wanyu.Mapper.IHusDao;
import com.wanyu.model.Hus;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by wanyu on 2018/3/21.
 */
public class HusMapperImpl {
   private static MybatisUtil mybatisUtil;
    private static SqlSession session;
    public HusMapperImpl(){
        mybatisUtil=new MybatisUtil();
        session=mybatisUtil.openSession();
    }
    @Test
    public void getHus(){
        IHusDao ihus=session.getMapper(IHusDao.class);
       Hus hus= ihus.getHus(1);
        System.out.println(hus.getHname());
    }
    @Test
    public void addHus(){
        IHusDao ihus=session.getMapper(IHusDao.class);
        Hus hus=new Hus();
        hus.setId(23);
        hus.setHname("James");
        ihus.insertHus(hus);
        session.commit();
    }
    @Test
    public void updateHus(){
        IHusDao ihus=session.getMapper(IHusDao.class);
        Hus hus=ihus.getHus(3);
        hus.setHname("abcd");
        ihus.updateHus(hus);
        session.commit();

    }
    @Test
    public void del(){
        IHusDao ihus=session.getMapper(IHusDao.class);
        ihus.deleteHus(2);
        session.commit();
    }
}
