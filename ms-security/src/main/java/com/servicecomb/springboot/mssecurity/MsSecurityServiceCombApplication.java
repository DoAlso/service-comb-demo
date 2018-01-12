package com.servicecomb.springboot.mssecurity;

import io.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableServiceComb
@SpringBootApplication
public class MsSecurityServiceCombApplication {

    public static void main(String[] args){
        SpringApplication.run(MsSecurityServiceCombApplication.class,args);
    }
}
