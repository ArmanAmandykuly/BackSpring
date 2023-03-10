package com.example.hw1;

import java.util.concurrent.atomic.AtomicLong;

import com.example.hw1.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("lol");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
