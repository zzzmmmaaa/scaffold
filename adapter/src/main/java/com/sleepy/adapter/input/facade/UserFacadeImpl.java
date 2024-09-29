package com.sleepy.adapter.input.facade;

import com.sleepy.adapter.input.transfer.UserDTOTransfer;
import com.sleepy.domain.service.UserService;
import com.sleepy.facade.UserFacade;
import com.sleepy.facade.model.UserDTO;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

@DubboService
public class UserFacadeImpl implements UserFacade {

    @Autowired
    UserService userService;

    @Autowired
    UserDTOTransfer transfer;

    @Override
    public Mono<UserDTO> getUserById(String id) {
        return userService.findUserById(id).flatMap(u -> Mono.just(transfer.toDTO(u)));
    }
}
