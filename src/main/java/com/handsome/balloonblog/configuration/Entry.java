package com.handsome.balloonblog.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.handsome.balloonblog")
public class Entry {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Entry.class, args);
    }
}