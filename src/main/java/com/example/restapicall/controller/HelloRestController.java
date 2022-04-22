package com.example.restapicall.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class HelloRestController {
    @GetMapping("/message")
    public String message() {
        return "Hello From BridgeLabz";
    }

    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello "+name+" From BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello "+name+" From BridgeLabz";
    }

    @PostMapping("/post")
    public String userData(@RequestBody User user) {
        return "Hello "+user.getFirstName()+" "+user.getLastName()+" from BridgeLabz";
    }
}
