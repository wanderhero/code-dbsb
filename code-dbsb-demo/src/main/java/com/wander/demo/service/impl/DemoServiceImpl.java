package com.wander.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.wander.demo.dao.DemoDao;
import com.wander.demo.entity.Demo;
import com.wander.demo.service.DemoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
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
    private final StringRedisTemplate redisTemplate;

    @Autowired
    public DemoServiceImpl(StringRedisTemplate redisTemplate, DemoDao demoDao) {
        this.redisTemplate = redisTemplate;
        this.demoDao = demoDao;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String test() {
        Demo demo;
        String demoJson = redisTemplate.opsForValue().get("demo");
        if (StringUtils.isNotBlank(demoJson)) {
            demo = JSONObject.parseObject(demoJson, Demo.class);
        } else {
            // test(1)
            demo = demoDao.test2(1L);
            if (null != demo) {
                redisTemplate.opsForValue().set("demo", JSONObject.toJSONString(demo));
            }
        }
        if (null != demo) {
            demoDao.update(demo);
            return demo.getName();
        }
        return "null";
    }

}
