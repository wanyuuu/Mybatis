package com.wanyu.Mapper;

import com.wanyu.model.Father;
import com.wanyu.model.Son;

import java.util.List;

/**
 * Created by wanyu on 2018/4/3.
 */
public interface IFatherDao {
    public void addFather(Father father);
    public List<Father> getFatherList();
    public List<Son> getSonList();
    public void update();
    public void del();
}
