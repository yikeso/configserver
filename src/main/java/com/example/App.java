package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by once on 2017/6/22.
 */
@SpringBootApplication
@EnableConfigServer
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
