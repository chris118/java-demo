package com.hhit.demo.service.Impl;

import com.hhit.demo.domain.User;
import com.hhit.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(User user) {
        return "success";
    }
}
