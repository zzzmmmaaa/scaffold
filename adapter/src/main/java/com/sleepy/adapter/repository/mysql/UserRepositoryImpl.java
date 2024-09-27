package com.sleepy.adapter.repository.mysql;

import com.sleepy.adapter.repository.entity.UserDO;
import com.sleepy.adapter.repository.mysql.reactiverepository.UserReactiveRepository;
import com.sleepy.adapter.repository.trasfer.UserTransfer;
import com.sleepy.domain.model.User;
import com.sleepy.domain.repositry.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl extends BaseRepositoryImpl<User, UserDO, UserTransfer, UserReactiveRepository> implements UserRepository {
}
