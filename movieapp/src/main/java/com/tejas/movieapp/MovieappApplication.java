package com.tejas.movieapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MovieappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieappApplication.class, args);
    }

    @GetMapping("/root")
    public String apiRoot() {
        return "Hello World";
    }
}
