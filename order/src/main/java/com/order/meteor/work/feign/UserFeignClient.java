package com.order.meteor.work.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "demo", fallback = FeignClientFallback.class)
public interface UserFeignClient {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index();
}

@Component
class FeignClientFallback implements UserFeignClient{

    @Override
    public String index() {
        return "index feign error";
    }
}
