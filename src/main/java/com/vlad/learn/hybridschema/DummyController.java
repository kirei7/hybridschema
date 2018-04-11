package com.vlad.learn.hybridschema;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello world";
    }
}
