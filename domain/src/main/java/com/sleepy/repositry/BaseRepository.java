package com.sleepy.repositry;

import com.sleepy.model.BaseModel;

public interface BaseRepository<T extends BaseModel> {

    T save(T t);

    boolean deleteById(String id);

    T update(T t);

    T findById(String id);

}
