package com.sleepy.service.impl;

import com.sleepy.model.User;
import com.sleepy.repositry.UserRepository;
import com.sleepy.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findUserById(String id) {
        return userRepository.findById(id);
    }
}
