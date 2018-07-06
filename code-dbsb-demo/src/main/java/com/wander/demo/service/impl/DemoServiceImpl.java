package com.wander.demo.service.impl;

import com.wander.demo.dao.DemoDao;
import com.wander.demo.entity.Demo;
import com.wander.demo.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Wander.Zeng
 * @create 2018-07-04 17:51
 * @desc DemoServiceImpl
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoDao demoDao;

    @Override
    public void test() {
        Demo demoEntity = demoDao.test("1");
        System.out.println("test:" + demoEntity.getId());
    }

}
