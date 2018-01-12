package com.servicecomb.springboot.msaccount;

import io.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableServiceComb
@SpringBootApplication
public class MsAccountServiceCombApplication {

    public static void main(String[] args){
        SpringApplication.run(MsAccountServiceCombApplication.class,args);
    }
}
