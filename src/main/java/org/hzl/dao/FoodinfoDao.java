package org.hzl.dao;

import com.github.pagehelper.PageInfo;
import org.hzl.pojo.Foodinfo;
import org.hzl.pojo.Parames;

import java.util.List;

public interface FoodinfoDao {

    public List<Foodinfo> allFood();
    public Foodinfo findFoodid(int foodId);
    public List<Foodinfo>  findName(Foodinfo foodinfo);
    public int update(Foodinfo foodinfo);
    public  int delete(int id);
    public int insert(Foodinfo foodinfo);
}
