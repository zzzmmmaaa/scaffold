package com.sleepy.domain.service.impl;

import com.sleepy.domain.service.UserService;
import com.sleepy.domain.model.User;
import com.sleepy.domain.repositry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserRepository userRepository;

    @Override
    public Mono<User> findUserById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public Mono<User> updateUser(User user) {
        return userRepository.update(user);
    }

    @Override
    public Mono<User> save(User user) {
        return userRepository.save(user);
    }
}
