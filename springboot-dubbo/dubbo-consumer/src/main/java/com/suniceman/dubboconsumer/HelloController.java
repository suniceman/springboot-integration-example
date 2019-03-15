package com.suniceman.dubboconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.suniceman.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        String hello = helloService.sayHello("world");
        System.out.println(helloService.sayHello("Silence"));
        return hello;
    }
}
