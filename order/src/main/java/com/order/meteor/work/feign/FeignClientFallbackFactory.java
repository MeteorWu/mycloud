package com.order.meteor.work.feign;

import com.order.meteor.work.model.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author Meteor.wu
 * @since 2018/4/9 11:14
 */
@Component
public class FeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {

    @Override
    public UserFeignClient create(Throwable throwable) {
        return new UserFeignClient() {

            @Override
            public String index() {
                System.out.println(throwable);
                return "index feign error";
            }
        };
    }
}
