package com.poster.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class GreetingController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from Api");
    }

    @GetMapping("/goodbye")
    public ResponseEntity<String> sayGoodBye() {
        return ResponseEntity.ok("Good by and see you again");
    }

}
