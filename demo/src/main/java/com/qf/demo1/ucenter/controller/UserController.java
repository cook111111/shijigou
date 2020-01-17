package com.qf.demo1.ucenter.controller;


import com.qf.demo1.ucenter.entity.User;
import com.qf.demo1.ucenter.service.IUserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 111
 * @since 2020-01-17
 */
@RestController
@RequestMapping("/ucenter/user")
public class UserController {
    @Resource
    IUserService userService;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public User test(@RequestBody User user){
        User s = userService.findUser(user.getUserId());
        return s;
}
}
