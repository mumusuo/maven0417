package org.hzl.service;

import com.github.pagehelper.PageInfo;
import org.hzl.pojo.Foodinfo;
import org.hzl.pojo.Parames;

import java.util.List;

public interface FoodinfoService {

    public List<Foodinfo> allFood();
    public Foodinfo findFoodid(int foodId);
    //分页
    public PageInfo<Foodinfo> getPageInfo(Parames parames);
    //分页根据条件查找
    public PageInfo<Foodinfo>  findName(Foodinfo foodinfo,Parames parames);
    public int update(Foodinfo foodinfo);
    public  int delete(int id);
    public int insert(Foodinfo foodinfo);
}
