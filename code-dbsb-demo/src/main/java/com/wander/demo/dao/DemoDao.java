package com.wander.demo.dao;

import com.wander.demo.entity.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Wander.Zeng
 * @create 2018-07-04 17:59
 * @desc DemoDao
 */
@Mapper
public interface DemoDao {

    /**
     * 测试
     * @param id
     * @return
     */
    Demo test(@Param("id") String id);

    /**
     * 插入
     * @param demo
     * @return
     */
    int insert(Demo demo);

    /**
     * 选择性插入
     * @param demo
     * @return
     */
    int insertSelective(Demo demo);

    /**
     * 批量插入
     * @param demos
     * @return
     */
    int insertList(List<Demo> demos);

    /**
     * 更新
     * @param demo
     * @return
     */
    int update(Demo demo);

}
