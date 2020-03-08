package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseApplication.class, args);
        Calculator calculator = new Calculator();
        System.out.println("1 + 4 = "+calculator.add(1,4));
        System.out.println("4.5 - 8 = "+calculator.substract(4.5,8));
    }

}
