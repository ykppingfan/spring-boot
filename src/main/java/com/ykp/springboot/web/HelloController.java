package com.ykp.springboot.web;

import com.ykp.springboot.config.FooProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yangkunpeng
 * @Date 2017/12/28
 */
@RestController
public class HelloController {

    private FooProperties fooProperties;

    @Autowired
    public void setFooProperties(FooProperties fooProperties) {
        this.fooProperties = fooProperties;
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println(fooProperties.getRemoteAddress());
        System.out.println(fooProperties.getSecurity().getRoles());
        return "hello world";
    }
}
