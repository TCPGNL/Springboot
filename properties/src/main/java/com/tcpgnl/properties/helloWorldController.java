package com.tcpgnl.properties;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloWorldController {
    @GetMapping("/hello")
    public String hello(){
        return "hello TCPGNL this page will be shown in hello and error page";
    }

}
