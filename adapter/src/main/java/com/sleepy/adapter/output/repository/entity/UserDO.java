package com.sleepy.adapter.output.repository.entity;

import lombok.*;
import org.springframework.data.relational.core.mapping.Table;

@Table("t_user")
@ToString(callSuper = true)
@Data
public class UserDO extends BaseDO{

    private String name;

    private Integer age;

}
