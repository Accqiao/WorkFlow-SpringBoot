package org.work.flow.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.work.flow.entity.ResultObject;
import org.work.flow.entity.User;
import org.work.flow.service.UserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;


    @RequestMapping("test")
    public ResultObject test(){
        ResultObject resObj = new ResultObject(true,"到啦!",101);
        User user = new User();
        user.setUid("10010");
        user.setPassword("1234");
        User oldUser = userService.selectByPrimaryKey("10010");
        resObj.setExtra(oldUser);
        int row = userService.toInsertOrUpdate(user);
        resObj.setNumber(row);
        User newUser = userService.selectByPrimaryKey("10010");
        resObj.setData(newUser);
        return resObj;
    }
    @RequestMapping("test2")
    public ResultObject test2(){
        ResultObject resObj = new ResultObject(true,"收到!，，选择");
        User user = new User();
        user.setUid("10010");
        user.setPassword("12345");
        User oldUser = userService.selectByPrimaryKey("10010");
        resObj.setExtra(oldUser);
        int row = userService.toInsertOrUpdateSelective(user);
        resObj.setNumber(row);
        User newUser = userService.selectByPrimaryKey("10010");
        resObj.setData(newUser);
        return resObj;
    }
    @RequestMapping("test3")
    public ResultObject test3(){
        ResultObject resObj = new ResultObject(true,"收到!，，选择");
        User user = new User();
        user.setUid("10010");
        user.setRole("user!");
        User oldUser = userService.selectByPrimaryKey("10010");
        resObj.setExtra(oldUser);
        int row = userService.updateByPrimaryKeySelective(user);
        resObj.setNumber(row);
        User newUser = userService.selectByPrimaryKey("10010");
        resObj.setData(newUser);
        return resObj;
    }


}
