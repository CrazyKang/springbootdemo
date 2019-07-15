package com.boottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.boottest"})
@ServletComponentScan(basePackages = "com.boottest.filter")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
