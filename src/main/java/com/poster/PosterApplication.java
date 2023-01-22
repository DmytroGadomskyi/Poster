package com.poster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PosterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PosterApplication.class, args);
    }

}
