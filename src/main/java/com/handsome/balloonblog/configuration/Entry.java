package com.handsome.balloonblog.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication(scanBasePackages = "com.handsome.balloonblog")
@EnableOpenApi
public class Entry {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Entry.class, args);
    }
}