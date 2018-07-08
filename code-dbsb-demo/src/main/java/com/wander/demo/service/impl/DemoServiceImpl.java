package com.wander.demo.service.impl;

import com.wander.demo.dao.DemoDao;
import com.wander.demo.entity.Demo;
import com.wander.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Wander.Zeng
 * @create 2018-07-04 17:51
 * @desc DemoServiceImpl
 */
@Service
public class DemoServiceImpl implements DemoService {

    private final DemoDao demoDao;

    @Autowired
    public DemoServiceImpl(DemoDao demoDao) {
        this.demoDao = demoDao;
    }

    @Override
    public String test() {
        Demo demo = demoDao.test("1");
        if (null != demo) {
            demoDao.update(demo);
            return demo.getName();
        }
        return "null";
    }

}
