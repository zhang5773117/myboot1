package com.zb.controller;

import com.alibaba.fastjson.JSON;
import com.zb.entity.User;
import com.zb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class UserController {

    @Autowired
    private UserService userService ;

//    @Autowired
//    private MyHello myHello;


    //@RequestMapping(value = "/show",method = RequestMethod.GET)
    //@ResponseBody
//    @PostMapping(value ="/postshow" )
    @GetMapping(value ="/getshow" )
    public String show(){
        User user = userService.getUserObj();
//        user.setName(myHello.sayHello());
        String str= JSON.toJSONString(user);
        return str;
    }
}
