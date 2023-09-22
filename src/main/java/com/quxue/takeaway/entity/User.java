package com.quxue.takeaway.entity;

//用户类

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;//用户账号
    private String password;//用户密码


}
