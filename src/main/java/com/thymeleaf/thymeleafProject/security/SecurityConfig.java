package com.thymeleaf.thymeleafProject.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/th/**").permitAll()
                .and().
                formLogin().loginPage("/iterate").loginProcessingUrl("/iterate").
          defaultSuccessUrl("/index",true).
                and().
                csrf().disable();
    }
}
