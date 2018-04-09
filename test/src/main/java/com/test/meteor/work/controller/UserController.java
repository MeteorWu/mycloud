package com.test.meteor.work.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户模块管理
 *
 * @author Meteor.wu
 * @since 2017/11/29 15:24
 */

@RestController
public class UserController {


//    @Autowired
//    private UserService userService;


//    @GetMapping("/{userId}")
//    public User getById(@PathVariable String userId) {
//        return userService.getById(userId);
//    }

    @GetMapping("/index")
    public String index() {
        return "helloword";
    }

}
