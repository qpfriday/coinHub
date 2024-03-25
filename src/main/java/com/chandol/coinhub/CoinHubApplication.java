package com.chandol.coinhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CoinHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoinHubApplication.class, args);
    }

}
