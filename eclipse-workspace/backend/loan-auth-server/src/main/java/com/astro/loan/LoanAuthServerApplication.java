package com.astro.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer
@SpringBootApplication
@EnableDiscoveryClient
public class LoanAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoanAuthServerApplication.class, args);
    }

}
