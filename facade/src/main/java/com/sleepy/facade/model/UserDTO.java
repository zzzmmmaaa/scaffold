package com.sleepy.facade.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {


    /**
     * id
     */
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 名称
     */
    private Integer age;

}
