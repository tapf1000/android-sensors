package com.astro.gateway.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.util.matcher.RequestHeaderRequestMatcher;


@Configuration
@EnableResourceServer

public class GatewayConfiguration extends ResourceServerConfigurerAdapter {

    private static final Logger logger = LoggerFactory.getLogger(GatewayConfiguration.class);

    @Override
    public void configure(final HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //.antMatchers("/**")
                .antMatchers("/auth-server/oauth/token","/loan-resource/v2","/csrf","/v2/**","/swagger-resources/**","/webjars/**","/swagger-ui.html")
                .permitAll()
                .antMatchers("/**")
                .authenticated()
                .and()
                .requestMatcher(new RequestHeaderRequestMatcher("Authorization"))
                .authorizeRequests().anyRequest().fullyAuthenticated();

    }

}