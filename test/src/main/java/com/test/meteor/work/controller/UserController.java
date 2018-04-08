package com.test.meteor.work.controller;

import com.test.meteor.work.model.User;
import com.test.meteor.work.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户模块管理
 *
 * @author Meteor.wu
 * @since 2017/11/29 15:24
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public User getById(@PathVariable String userId) {
        return userService.getById(userId);
    }

    @GetMapping("/index")
    public String index() {
        return "helloword";
    }

}
