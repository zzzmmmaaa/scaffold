package com.sleepy.adapter.input.transfer;

import com.sleepy.domain.model.User;
import com.sleepy.facade.model.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDTOTransfer {

    UserDTO toDTO(User user);

    User toModel(UserDTO userDTO);
}
