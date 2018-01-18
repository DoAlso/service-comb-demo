package com.servicecomb.springboot.mstest.comsumer;

import com.microservice.common.mscommon.bean.BaseEntity;
import com.microservice.common.mscommon.bean.BaseParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserServiceClient {

    @Autowired
    private RestTemplate restTemplate;

    public BaseEntity getUserService(BaseParams<Long> baseParams){
        BaseEntity<?> baseEntity = restTemplate.postForObject("cse://msaccount/user/getUser",baseParams,BaseEntity.class);
        return baseEntity;
    }


}
