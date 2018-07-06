package com.wander.demo.controller;

import com.wander.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wander.Zeng
 * @create 2018-07-04 17:37
 * @desc DemoController
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/test")
    public String test() {
        demoService.test();
        return "hello";
    }

}
