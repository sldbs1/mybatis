package com.me.mybatis.mapper;

import com.me.mybatis.pojo.User;

import java.util.List;

/**
 * The interface User mapper.
 */
public interface UserMapper {

    /**
     * Insert user int.
     *
     * @return the int
     */
    int insertUser();

    /**
     * Gets user.
     *
     * @return the user
     */
    List<User> getUser();


    /**
     * 根据id查询user
     *
     * @param id the id
     * @return the user
     */
    User getUserById(int id);

    /**
     * 判断登陆
     *
     * @param username 账号
     * @param password 密码
     * @return the user
     */
    User checkLogin(String username,String password);
}
