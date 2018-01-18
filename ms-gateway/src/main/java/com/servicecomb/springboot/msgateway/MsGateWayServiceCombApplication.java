package com.servicecomb.springboot.msgateway;


import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableServiceComb
@SpringBootApplication
public class MsGateWayServiceCombApplication {

    public static void main(String[] args){
        SpringApplication.run(MsGateWayServiceCombApplication.class,args);
    }
}
