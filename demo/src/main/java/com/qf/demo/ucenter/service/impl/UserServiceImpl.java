package com.qf.demo.ucenter.service.impl;

import com.qf.demo.ucenter.entity.User;
import com.qf.demo.ucenter.mapper.UserMapper;
import com.qf.demo.ucenter.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jerry
 * @since 2020-01-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
@Resource
UserMapper userMapper;
    @Override
    public Integer findUser(User user) {
        return userMapper.findUser(user.getUsername(), user.getPassword());
    }
}
