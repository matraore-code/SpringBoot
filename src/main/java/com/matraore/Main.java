package com.matraore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/customers")
public class Main {
    private final CustomerRepository customerRepository;

    public Main(CustomerRepository customerRepository1) {
        this.customerRepository = customerRepository1;
    }
    public static void main(String[] args) {
        //System.out.println("Hello World");
        SpringApplication.run(Main.class, args);
    }

    @GetMapping
    public List<Customer>getCustomers(){
        return customerRepository.findAll();
    }

    /*@GetMapping("/")
    public GreetResponse greet() {
        GreetResponse greetResponse = new GreetResponse(
                "Hello",
                List.of("Java", "Golang", "Angular"),
                new Person("Moctar", 26, 10000));
        return greetResponse;
    }
    record Person(String name, int age, double savings) {

    }

    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person

    ) {

    }*/
}
