package com.hotmail.bess410.tacocloud;

import com.hotmail.bess410.tacocloud.samples.Sample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class TacoCloudApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TacoCloudApplication.class, args);
    }
}