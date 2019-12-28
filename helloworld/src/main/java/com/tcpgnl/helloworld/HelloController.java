package com.tcpgnl.helloworld;

        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

// 加入注解
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World TCPGNL!";

    }

}
