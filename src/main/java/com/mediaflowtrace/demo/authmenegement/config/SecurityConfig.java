package com.mediaflowtrace.demo.authmenegement.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableWebSecurity
@Slf4j
public class SecurityConfig {
    

    @Bean 
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){

        UserDetails user1 =  User.builder()
                                .username("user1")
                                .password("{noop}11")
                                .authorities("superUser")
                                .build();
        UserDetails user2 =  User.builder()
                                .username("user2")
                                .password("{noop}22")
                                .authorities("manager")
                                .build();

        log.info("testuser 創建成功");
        return new InMemoryUserDetailsManager(List.of(user1,user2));

    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{

       log.info("filter begin"); 

      return  httpSecurity
      .authorizeHttpRequests(request -> request.anyRequest().permitAll())
        .httpBasic(Customizer.withDefaults())
        .csrf(csrf -> csrf.disable())
        .build();

    }


}
