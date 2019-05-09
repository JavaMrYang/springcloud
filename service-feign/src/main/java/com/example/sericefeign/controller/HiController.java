package com.example.sericefeign.controller;

import com.example.sericefeign.serviceApi.SchedualServiceHiApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LiuYang
 * @Date 2019/5/9/00914:13
 * @Version 1.0
 **/
@RestController
public class HiController {

    @Autowired
    SchedualServiceHiApi schedualServiceHiApi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHiApi.sayHiFromClientOne( name );
    }
}
