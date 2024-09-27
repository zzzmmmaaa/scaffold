package com.sleepy.domain.service;

import com.sleepy.domain.model.User;
import reactor.core.publisher.Mono;

public interface UserService {

    /**
     * 根据id查找user
     * @param id
     * @return
     */
    Mono<User> findUserById(String id);

    Mono<User> updateUser(User user);

    Mono<User> save(User user);

}
