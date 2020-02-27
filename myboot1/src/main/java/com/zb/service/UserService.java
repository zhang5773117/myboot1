package com.zb.service;

import com.zb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private User user;
    //zjdev
    public User getUserObj() {
        //张三
        System.out.println("test");
        //李四
        System.out.println("李四");
        return user;
    }
}
