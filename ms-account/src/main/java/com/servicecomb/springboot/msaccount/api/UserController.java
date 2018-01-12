package com.servicecomb.springboot.msaccount.api;

import com.microservice.common.mscommon.bean.BaseEntity;
import com.microservice.common.mscommon.bean.BaseParams;
import com.microservice.common.mscommon.bean.msaccount.User;
import com.microservice.common.mscommon.common.Constants;
import com.microservice.common.mscommon.util.MD5HashUtil;
import com.servicecomb.springboot.msaccount.exception.CustomException;
import com.servicecomb.springboot.msaccount.model.param.LoginParam;
import com.servicecomb.springboot.msaccount.provider.UserService;
import io.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.ws.rs.core.MediaType;

@RestController
@RestSchema(schemaId = "userController")
@RequestMapping(path = "/user", produces = MediaType.APPLICATION_JSON)
public class UserController extends BaseController{

    @Autowired
    private UserService userService;


    @PostMapping("/getUser")
    public BaseEntity getUser(@RequestBody BaseParams<Long> baseParams) throws Exception{
        Long userId = baseParams.getData();
        User user = userService.findUserById(userId);
        if(user == null){
            throw new CustomException("用户不存在！");
        }
        return initBaseEntityResponse(Constants.HttpConstants.OK, "success", user);
    }

}
