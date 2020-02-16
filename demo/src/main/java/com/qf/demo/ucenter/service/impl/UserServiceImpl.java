package com.qf.demo1.ucenter.service.impl;

import com.qf.demo1.ucenter.entity.User;
import com.qf.demo1.ucenter.mapper.UserMapper;
import com.qf.demo1.ucenter.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 111
 * @since 2020-01-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
@Resource
UserMapper userMapper;
    @Override
    public User findUser(Integer id) {
        User user = userMapper.selectById(id);
        return user;
    }
}
