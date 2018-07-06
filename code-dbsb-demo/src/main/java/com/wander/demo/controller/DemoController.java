package com.wander.demo.controller;

import com.wander.demo.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Wander.Zeng
 * @create 2018-07-04 17:37
 * @desc DemoController
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    @RequestMapping("/test")
    public String test() {
        String test = demoService.test();
        return "hello : " + test;
    }

}
