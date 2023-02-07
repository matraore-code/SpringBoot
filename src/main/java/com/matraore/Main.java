package com.matraore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public GreetResponse greet() {
        GreetResponse greetResponse = new GreetResponse(
                "Hello",
                List.of("Java", "Golang", "Angular"),
                new Person("Moctar"));
        return greetResponse;
    }
    record Person(String name) {

    }

    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person

    ) {

    }
}
