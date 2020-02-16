package com.qf.demo.ucenter.mapper;

import com.qf.demo.ucenter.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jerry
 * @since 2020-01-23
 */
public interface UserMapper extends BaseMapper<User> {
    Integer findUser(@Param("username") String username,@Param("password")String password);
}
