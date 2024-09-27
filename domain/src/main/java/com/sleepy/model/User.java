package com.sleepy.model;


import lombok.Data;

/**
 * 用户领域模型
 */
@Data
public class User extends BaseModel{

    /**
     * 姓名
     */
    private String name;

    /**
     * 名称
     */
    private Integer age;

}
