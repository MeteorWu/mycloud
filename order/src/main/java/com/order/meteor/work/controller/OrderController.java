package com.order.meteor.work.controller;

import com.order.meteor.work.feign.UserFeignClient;
import com.order.meteor.work.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Meteor.wu
 * @since 2018/4/8 18:28
 */
@RequestMapping("/user")
public class OrderController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/{userId}")
    public User findById(@PathVariable String userId) {
        return this.userFeignClient.getById(userId);
    }

    @GetMapping("/index")
    public String index() {
        return this.userFeignClient.index();
    }
}
