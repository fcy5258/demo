package com.quxue.takeaway.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.quxue.takeaway.entity.Result;
import com.quxue.takeaway.entity.User;
import com.quxue.takeaway.mapper.UserMapper;
import com.quxue.takeaway.service.UserService;

public class UserImpl extends ServiceImpl<UserMapper, User>implements UserService {


    @Override
    public Result login(String username, String password) {
        QueryWrapper<User> objectQueryWrapper = new QueryWrapper<>();
        objectQueryWrapper.eq("username",username);
        objectQueryWrapper.eq("password",password);

        User user = this.getOne(objectQueryWrapper);
        if (user != null){
            return Result.success(user);
        }
        return Result.error("账号或密码错误，请重新登陆！");

    }

    @Override
    public Result select(Integer currentPage, Integer pageSize, User conditionUser) {
        Page<User> objectPage = new Page<>(currentPage, pageSize);
        QueryWrapper<User> objectQueryWrapper = new QueryWrapper<>();

        if (conditionUser.getUsername()!=null && !"".equals(conditionUser.getUsername())){
            objectQueryWrapper.like("username",conditionUser.getUsername());
        }

        IPage<User> userIpage = page(objectPage,objectQueryWrapper);

        return Result.success();


    }
}
