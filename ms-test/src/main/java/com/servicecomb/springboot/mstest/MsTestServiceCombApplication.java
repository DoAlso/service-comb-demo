package com.servicecomb.springboot.mscache;

import io.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableServiceComb
@SpringBootApplication
public class MsTestServiceCombApplication {

    public static void main(String[] args){
        SpringApplication.run(MsTestServiceCombApplication.class,args);
    }
}
