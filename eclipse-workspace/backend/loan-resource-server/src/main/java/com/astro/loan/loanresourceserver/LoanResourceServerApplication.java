package com.astro.loan.loanresourceserver;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


@EnableResourceServer
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableFeignClients("com.astro.loan.loanresourceserver.proxy")
public class LoanResourceServerApplication {

    private static final Logger logger = LoggerFactory.getLogger(LoanResourceServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LoanResourceServerApplication.class, args);
    }

    @GetMapping("/rest/me")
    public Principal getUser(Principal principal) {
        logger.info("user logged in is "+principal.getName());
        return principal;
    }
}