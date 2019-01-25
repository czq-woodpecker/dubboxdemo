package com.woodpecker.czq.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.woodpecker.czq.service.UserService;

/**
 * @author: woodpecker
 * @Date: 2019/1/20 18:29
 */
//注意是dubbo的service注解
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "woodpecker";
    }
}
