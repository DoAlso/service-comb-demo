package com.servicecomb.springboot.mstest.comsumer;

import com.microservice.common.mscommon.bean.BaseEntity;
import com.microservice.common.mscommon.bean.BaseParams;
import com.microservice.common.mscommon.common.Constants;
import com.microservice.common.mscommon.util.FastJsonUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceClient {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getUserServiceFallBack")
    public BaseEntity getUserService(BaseParams<Long> baseParams){
        String getUserResult = restTemplate.postForEntity("cse://msaccount/user/getUser",baseParams,String.class).getBody();
        BaseEntity<?> baseEntity = FastJsonUtil.toBean(getUserResult, BaseEntity.class);
        return baseEntity;
    }

    public BaseEntity<?> getUserServiceFallBack(BaseParams<Long> baseParams){
        BaseEntity<?> baseEntity = new BaseEntity<>();
        baseEntity.setCode(Constants.HttpConstants.OK);
        baseEntity.setData(null);
        baseEntity.setMessage("error");
        return baseEntity;
    }

}
