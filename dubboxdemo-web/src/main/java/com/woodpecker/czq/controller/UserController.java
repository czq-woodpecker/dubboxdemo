package com.woodpecker.czq.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.woodpecker.czq.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: woodpecker
 * @Date: 2019/1/21 20:32
 */

@Controller
@RequestMapping("/user")
public class UserController {

    //远程注入
    @Reference
    private UserService userService;

    @RequestMapping("/showName")
    @ResponseBody
    public String showName(){
        return userService.getName();
    }
}
