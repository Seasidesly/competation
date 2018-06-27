package com.kunpeng.competition.service;

import com.kunpeng.competition.domain.User;

import java.util.List;

public interface UserService {


    /**
     * 增加
     * @param user
     * @return
     */
    User insertUser(User user);


    /**
     * 修改
     * @param user
     * @return
     */
    User updateUser(User user);


    /**
     * 删除
     * @param id
     * @return
     */
    User deleteUser(Long id);


    /**
     * 根据id 查找
     * @param id
     * @return
     */
    User findUserById(Long id);


    /**
     * 查找，不建议用
     * @return
     */
    List<User> findAll();
}
