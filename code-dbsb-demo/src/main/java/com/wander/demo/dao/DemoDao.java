package com.wander.demo.dao;

import com.wander.demo.entity.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
     *
     * @param id
     * @return
     */
    Demo test(@Param("id") Long id);

    /**
     * 测试 @Select
     *
     * @param id
     * @return
     */
    @Select("select * from tbl_demo where id = #{id}")
    Demo test2(@Param("id") Long id);

    /**
     * 插入
     *
     * @param demo
     * @return
     */
    int insert(Demo demo);

    /**
     * 选择性插入
     *
     * @param demo
     * @return
     */
    int insertSelective(Demo demo);

    /**
     * 批量插入
     *
     * @param demos
     * @return
     */
    int insertList(List<Demo> demos);

    /**
     * 更新
     *
     * @param demo
     * @return
     */
    int update(Demo demo);

}
