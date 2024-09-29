package com.sleepy.adapter.output.repository.mysql.reactiverepository;

import com.sleepy.adapter.output.repository.entity.BaseDO;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BaseReactiveRepository<D extends BaseDO> extends ReactiveCrudRepository<D, String> {
}
