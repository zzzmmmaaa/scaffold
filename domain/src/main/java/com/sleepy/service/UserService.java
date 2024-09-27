package com.sleepy.service;

import com.sleepy.model.User;

public interface UserService {

    /**
     * 根据id查找user
     * @param id
     * @return
     */
    public User findUserById(String id);

}
