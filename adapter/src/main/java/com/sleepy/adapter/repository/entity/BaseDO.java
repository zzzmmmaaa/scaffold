package com.sleepy.adapter.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;

import java.io.Serializable;

@Data
public class BaseDO implements Serializable, Persistable<String> {

    @Id
    private String id;


    @Transient
    private boolean isNew;

    @Override
    @Transient
    public boolean isNew() {
        return this.isNew || id == null;
    }

    public BaseDO setAsNew(){
        this.isNew = true;
        return this;
    }


}
