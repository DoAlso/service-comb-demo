package com.servicecomb.springboot.msconfig;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableServiceComb
@SpringBootApplication
public class MsConfigServiceCombApplication {

    public static void main(String[] args){
        SpringApplication.run(MsConfigServiceCombApplication.class,args);
    }
}
