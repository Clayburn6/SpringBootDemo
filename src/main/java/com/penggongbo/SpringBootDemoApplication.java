package com.penggongbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@RestController
public class SpringBootDemoApplication {
    public static void main( String[] args ) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
