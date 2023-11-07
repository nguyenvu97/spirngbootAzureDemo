package com.example.aruretestgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class spirngbootAzureDemo {

    public static void main(String[] args) {
        SpringApplication.run(spirngbootAzureDemo.class, args);


    }
    @GetMapping("/mesgger")
    public String abc (){
        return "helo asure tao den day";
    }

}
