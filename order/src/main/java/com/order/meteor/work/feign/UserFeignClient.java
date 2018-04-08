package com.order.meteor.work.feign;

import com.order.meteor.work.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "demo", fa)
public interface UserFeignClient {
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public User getById(@PathVariable("userId") String userId);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index();
}
