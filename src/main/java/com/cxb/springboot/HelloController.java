package com.cxb.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping()
    public String hello(){
        return "hello world ！";
    }

    @GetMapping("/jenkins")
    public String jenkins(){
        return "hello jenkins ！";
    }
}
