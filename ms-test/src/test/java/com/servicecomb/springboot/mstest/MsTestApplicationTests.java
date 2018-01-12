package com.servicecomb.springboot.mstest;

import com.microservice.common.mscommon.bean.BaseEntity;
import com.microservice.common.mscommon.bean.BaseParams;
import com.microservice.common.mscommon.util.FastJsonUtil;
import com.servicecomb.springboot.mstest.comsumer.UserServiceClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MsTestApplicationTests {

	@Autowired(required = false)
	private UserServiceClient userServiceClient;
	@Test
	public void contextLoads() {
		BaseParams<Long> baseParams = new BaseParams<>();
		baseParams.setData(1l);
		BaseEntity baseEntity = userServiceClient.getUserService(baseParams);
		System.out.println(FastJsonUtil.toJSONString(baseEntity));
	}

}
