package com.xjn.mapper;

import com.xjn.pojo.User;

import java.util.Map;

public interface UserMapper {
    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 根据id查询用户信息
     */
    User selectUserById(Integer id);

    /**
     * 根据name查询用户信息
     */
    User selectUserByName(String name);

    /**
     * 根据name和age查询用户信息
     */
    User selectUserByNameAndAge(String name, int age);

    /**
     * 根据name和age查询用户信息
     */
    User selectUserByNameAndAge2(Map<String,Object> map);
}
