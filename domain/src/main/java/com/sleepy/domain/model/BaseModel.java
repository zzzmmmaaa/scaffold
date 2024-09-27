package com.sleepy.domain.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 领域模型基类
 */
@Data
public class BaseModel implements Serializable {

    /**
     * id
     */
    private String id;

}
