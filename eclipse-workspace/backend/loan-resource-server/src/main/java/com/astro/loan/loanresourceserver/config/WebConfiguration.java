package com.astro.loan.loanresourceserver.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;


//@Configuration
public class WebConfiguration extends ResourceServerConfigurerAdapter {


    @Override
    public void configure(final HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/csrf/**","/v2/**","/swagger-resources/**","/webjars/**","/swagger-ui.html")

                .permitAll()
                .antMatchers("/**")
                .authenticated();
        http.csrf().disable();
    }

    /*@Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .antMatcher("/rest/**")
                .authorizeRequests().anyRequest().authenticated();
    }*/
}