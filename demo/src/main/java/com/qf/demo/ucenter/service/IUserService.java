package com.qf.demo.ucenter.service;

import com.qf.demo.ucenter.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jerry
 * @since 2020-01-23
 */
public interface IUserService extends IService<User> {
    Integer findUser(User user);
}
