package com.hhit.demo.service;

import com.hhit.demo.domain.User;

/**
 * @author wangxiaopeng
 */
public interface UserService {
    String addUser(User user);

    User getUser(Long id);
}
