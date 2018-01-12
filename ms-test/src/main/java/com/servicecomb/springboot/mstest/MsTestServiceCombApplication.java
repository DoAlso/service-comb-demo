package com.servicecomb.springboot.mstest;

import io.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import io.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableServiceComb
@SpringBootApplication
public class MsTestServiceCombApplication {

    public static void main(String[] args){
        SpringApplication.run(MsTestServiceCombApplication.class,args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return RestTemplateBuilder.create();
    }
}
