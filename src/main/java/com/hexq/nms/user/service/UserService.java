package com.hexq.nms.user.service;

import com.hexq.nms.user.model.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * 用户 Service
 * @author hexq
 * @date 2018-06-05
 */
public interface UserService extends IService<User> {

    /**
     * 根据账户获取用户
     * @param account 账号
     * @return 用户
     */
    User getByAccount(String account);
}
