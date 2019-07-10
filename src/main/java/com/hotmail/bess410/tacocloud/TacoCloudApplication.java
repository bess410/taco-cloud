package com.hotmail.bess410.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TacoCloudApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TacoCloudApplication.class, args);
    }
}