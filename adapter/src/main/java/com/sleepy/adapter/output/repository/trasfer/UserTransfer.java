package com.sleepy.adapter.output.repository.trasfer;


import com.sleepy.adapter.output.repository.entity.UserDO;
import com.sleepy.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserTransfer extends BaseTransfer<UserDO, User>{


}
