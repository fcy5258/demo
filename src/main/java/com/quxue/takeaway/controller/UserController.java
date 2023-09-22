package com.quxue.takeaway.controller;

import com.quxue.takeaway.entity.Result;
import com.quxue.takeaway.entity.User;
import com.quxue.takeaway.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/landing.do")
    public Result landing(String username,String password){
        Result result = userService.login(username, password);
        return result;
    }

    @RequestMapping("/list.do")
    public Result list(@RequestParam(defaultValue = "1") Integer currentPage,
                       @RequestParam(defaultValue = "5") Integer pageSize,
                       @RequestBody User conditionUser){

        /*System.out.println("currentPage = " + currentPage);
        System.out.println("pageSize = " + pageSize);
        System.out.println("conditionUser = " + conditionUser);*/
        

        return userService.select(currentPage,pageSize,conditionUser);

    }
}
