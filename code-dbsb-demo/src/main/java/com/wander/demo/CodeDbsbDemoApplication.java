package com.wander.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Wander.Zeng
 * @create 2018-07-04 17:31
 * @desc CodeDbsbDemoApplication
 */
@SpringBootApplication
@MapperScan("com.wander.demo.dao")
public class CodeDbsbDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeDbsbDemoApplication.class, args);
    }

}
