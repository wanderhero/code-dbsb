package com.wander.demo.service.impl;

import com.wander.demo.dao.DemoDao;
import com.wander.demo.entity.Demo;
import com.wander.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String test() {
        // test(1)
        Demo demo = demoDao.test2(1L);
        if (null != demo) {
            demoDao.update(demo);
            return demo.getName();
        }
        return "null";
    }

}
