package com.example.sericefeign.serviceApi;

import org.springframework.stereotype.Component;

/**
 * @Author LiuYang
 * @Date 2019/5/9/00914:25
 * @Version 1.0
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHiApi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name;
    }
}
