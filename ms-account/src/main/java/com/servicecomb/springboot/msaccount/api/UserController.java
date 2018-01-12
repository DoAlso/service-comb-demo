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


    @PostMapping("/login")
    public BaseEntity login(@RequestBody BaseParams<LoginParam> baseParams) throws Exception{
        LoginParam loginParam = baseParams.getData();
        User user = userService.findUser(loginParam.getAccount());
        if(user == null){
            throw new CustomException("账户不存在！");
        }
        if(!MD5HashUtil.toMD5(loginParam.getPassword()).equals(user.getuPassword())){
            throw new CustomException("密码错误！");
        }
        return initBaseEntityResponse(Constants.HttpConstants.OK, "success", user);
    }

}
