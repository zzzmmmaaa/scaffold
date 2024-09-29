package com.sleepy.facade;

import com.sleepy.facade.model.UserDTO;
import reactor.core.publisher.Mono;

public interface UserFacade {

    Mono<UserDTO> getUserById(String id);

}
