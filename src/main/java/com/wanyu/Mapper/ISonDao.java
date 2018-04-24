package com.wanyu.Mapper;

import com.wanyu.model.Son;

import java.util.List;

/**
 * Created by wanyu on 2018/4/3.
 */
public interface ISonDao {
    public List<Son> getSonList(String name);
}
