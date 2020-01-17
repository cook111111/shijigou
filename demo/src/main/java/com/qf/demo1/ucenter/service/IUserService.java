package com.qf.demo1.ucenter.service;

import com.qf.demo1.ucenter.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import io.swagger.models.auth.In;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 111
 * @since 2020-01-17
 */
public interface IUserService extends IService<User> {
    User findUser(Integer id);
}
