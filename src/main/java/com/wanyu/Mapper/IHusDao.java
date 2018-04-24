package com.wanyu.Mapper;

import com.wanyu.model.Hus;

import java.util.List;

/**
 * Created by wanyu on 2018/3/23.
 */
public interface IHusDao {
    public List<Hus> getHusList();
    public void insertHus(Hus hus);
    public void deleteHus(int id);
    public void updateHus(Hus hus);
    public Hus getHus(int id);
}
