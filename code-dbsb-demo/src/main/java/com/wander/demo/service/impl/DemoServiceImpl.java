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
    public String test() {
        Demo demo = demoDao.test("1");
        if (null != demo) {
            return demo.getName();
        }
        return "null";
    }

}
