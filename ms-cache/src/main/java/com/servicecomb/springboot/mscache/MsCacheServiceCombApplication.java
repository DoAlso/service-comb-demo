package com.servicecomb.springboot.mscache;


import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableServiceComb
@SpringBootApplication
public class MsCacheServiceCombApplication {

    public static void main(String[] args){
        SpringApplication.run(MsCacheServiceCombApplication.class,args);
    }
}
