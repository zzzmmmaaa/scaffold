package com.sleepy.adapter.controller;

import com.sleepy.domain.model.User;
import com.sleepy.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("findUserById")
    public Mono<User> findUserById(@RequestParam(value = "id", required = false) String id){
        if (id == null) {
            return Mono.error(new IllegalArgumentException("ID must be provided"));
        }
        return  service.findUserById(id);
    }


    @PostMapping("update")
    public Mono<User> update(@RequestBody User user){
        if (user == null) {
            return null;
        }
        return  service.updateUser(user);
    }

    @PostMapping("save")
    public Mono<User> save(@RequestBody User user){
        if (user == null) {
            return null;
        }
        return  service.save(user);
    }

}
