package com.sleepy.adapter.repository.mysql.reactiverepository;

import com.sleepy.adapter.repository.entity.BaseDO;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BaseReactiveRepository<D extends BaseDO> extends ReactiveCrudRepository<D, String> {
}
