package com.sleepy.domain.repositry;

import com.sleepy.domain.model.BaseModel;
import reactor.core.publisher.Mono;

public interface BaseRepository<T extends BaseModel> {
    Mono<T> save(T t);

    boolean deleteById(String id);

    Mono<T> update(T t);

    Mono<T> findById(String id);

}
