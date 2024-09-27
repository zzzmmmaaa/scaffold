package com.sleepy.adapter.repository.trasfer;


import com.sleepy.adapter.repository.entity.UserDO;
import com.sleepy.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserTransfer extends BaseTransfer<UserDO, User>{


}
