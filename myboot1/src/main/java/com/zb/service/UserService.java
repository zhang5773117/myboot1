package com.zb.service;

import com.zb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private User user;

    public User getUserObj() {

        return user;
    }
}
