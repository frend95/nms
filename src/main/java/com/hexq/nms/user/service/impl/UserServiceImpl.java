package com.hexq.nms.user.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hexq.nms.user.mapper.UserMapper;
import com.hexq.nms.user.model.User;
import com.hexq.nms.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户 ServiceImpl
 * @author hexq
 * @date 2018-06-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User getByAccount(String account) {
        EntityWrapper<User> wrapper = new EntityWrapper<>();
        wrapper.eq("account", account);
        return selectOne(wrapper);
    }

}
