package com.quxue.takeaway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.quxue.takeaway.entity.Result;
import com.quxue.takeaway.entity.User;

public interface UserService extends IService<User> {

    Result login(String username,String password);

    Result select(Integer currentPage,Integer pageSize,User conditionUser);


}
