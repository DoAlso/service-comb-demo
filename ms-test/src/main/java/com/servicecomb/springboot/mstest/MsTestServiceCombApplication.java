package com.servicecomb.springboot.mstest;


import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableServiceComb
@SpringBootApplication
public class MsTestServiceCombApplication {

    public static void main(String[] args){
        SpringApplication.run(MsTestServiceCombApplication.class,args);
    }

    @Bean
    RestTemplate restTemplate(){
        return RestTemplateBuilder.create();
    }
}
