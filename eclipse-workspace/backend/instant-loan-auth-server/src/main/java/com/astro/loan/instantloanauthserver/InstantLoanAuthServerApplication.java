package com.astro.loan.instantloanauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class InstantLoanAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InstantLoanAuthServerApplication.class, args);
    }

}
