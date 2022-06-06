package com.hanendra.dockerDemoWithSpringboot.RestServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloResource {

    @GetMapping("/rest/docker/hello")
    public String helloMessage(){
        return "Hello Docker engine";
    }
}
