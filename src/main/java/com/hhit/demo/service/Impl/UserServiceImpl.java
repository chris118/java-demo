package com.hhit.demo.service.Impl;

import com.hhit.demo.domain.User;
import com.hhit.demo.mapper.UserMapper;
import com.hhit.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangxiaopeng
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String addUser(User user) {
        return "success";
    }

    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }
}
