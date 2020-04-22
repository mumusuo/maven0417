package org.hzl.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.hzl.dao.FoodinfoDao;
import org.hzl.pojo.Foodinfo;
import org.hzl.pojo.Parames;
import org.hzl.service.FoodinfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class FoodinfoServiceImpl implements FoodinfoService {
    @Resource
    private FoodinfoDao foodinfoDao;


    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Foodinfo> allFood() {
        return foodinfoDao.allFood();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Foodinfo findFoodid(int foodId) {
        return foodinfoDao.findFoodid(foodId);
    }


    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public PageInfo<Foodinfo> getPageInfo(Parames parames) {
        //1>开始进行分页
                PageHelper.startPage(parames.getPageCurrent(),parames.getPageSize());

        //2>调用底层方法
        List<Foodinfo> list = foodinfoDao.allFood();

        //3>分页包装
        PageInfo<Foodinfo> pageInfo =new PageInfo<>(list);


        return pageInfo;
    }

    @Override
    public PageInfo<Foodinfo> findName(Foodinfo foodinfo, Parames parames) {
        //1>开始进行分页
        PageHelper.startPage(parames.getPageCurrent(),parames.getPageSize());

        //2>调用底层方法
        List<Foodinfo> list = foodinfoDao.findName(foodinfo);

        //3>分页包装
        PageInfo<Foodinfo> pageInfo =new PageInfo<>(list);

        return pageInfo;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int update(Foodinfo foodinfo) {
        return foodinfoDao.update(foodinfo);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int delete(int id) {
        return foodinfoDao.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insert(Foodinfo foodinfo) {
        return foodinfoDao.insert(foodinfo);
    }
}
