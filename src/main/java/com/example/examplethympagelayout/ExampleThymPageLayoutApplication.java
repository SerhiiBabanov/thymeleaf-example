package com.example.examplethympagelayout;

import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleThymPageLayoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleThymPageLayoutApplication.class, args);
    }

//    @Bean
//    public LayoutDialect layoutDialect() {
//        return new LayoutDialect();
//    }
}
