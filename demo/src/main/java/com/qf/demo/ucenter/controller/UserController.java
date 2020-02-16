package com.qf.demo.ucenter.controller;


import com.qf.demo.ucenter.entity.User;
import com.qf.demo.ucenter.service.IUserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jerry
 * @since 2020-01-23
 */
@RestController
@RequestMapping("/ucenter/user")
@RefreshScope
public class UserController {
    @Resource
    private IUserService userService;
    @Value("${user.name}")
    private String username;
    @RequestMapping("/login")
    public String login(@RequestBody User user){
        Integer i = userService.findUser(user);
        return ""+i;
    }

    @GetMapping("/test")
    public String test(){
        return username;
    }
}
