package com.servicecomb.springboot.msaccount.api;

import com.microservice.common.mscommon.bean.BaseEntity;

public abstract class BaseController {

    protected BaseEntity<?> initBaseEntityResponse(Integer code, String message, Object data){
        BaseEntity<Object> baseEntity = new BaseEntity<Object>();
        baseEntity.setCode(code);
        baseEntity.setMessage(message);
        baseEntity.setData(data);
        return baseEntity;
    }
}
