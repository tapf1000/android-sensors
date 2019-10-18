package com.astro.loan.instantloanauthserver.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class BcryptGenerator {

    Logger logger = LoggerFactory.getLogger(BcryptGenerator.class);
    @Bean
    public void main() {

        int i = 0;
        while (i < 5) {
            String password = "pin";
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String hashedPassword = passwordEncoder.encode(password);

            logger.info(hashedPassword);
            i++;
        }

    }
}