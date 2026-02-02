package com.example.practise.configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfiguration {

//    private final RestTemplate builder;
//
//    public ApplicationConfiguration(RestTemplate builder){
//        this.builder = builder;
//    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
