package com.order.meteor.work.controller;

import com.order.meteor.work.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Meteor.wu
 * @since 2018/4/8 18:28
 */
@RestController
public class OrderController {

    @Autowired
    private UserFeignClient userFeignClient;

//    @GetMapping("/{userId}")
//    public User findById(@PathVariable String userId) {
//        return this.userFeignClient.getById(userId);
//    }

    @GetMapping("/user/index")
    public String index() {
        return this.userFeignClient.index();
    }
}
