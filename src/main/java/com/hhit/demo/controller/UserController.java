package com.hhit.demo.controller;

import com.hhit.demo.entity.User;
import com.hhit.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author wangxiaopeng
 */
@Api(tags = "用户接口")
@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("添加用户")
    @PostMapping("/add")
    public String addUser(@RequestBody @Valid User user, BindingResult bindingResult) {
        for (ObjectError error : bindingResult.getAllErrors()) {
            return error.getDefaultMessage();
        }

        return userService.addUser(user);
    }

    @ApiOperation("获取用户")
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(1L);
        user.setAccount("12345678");
        user.setPassword("12345678");
        user.setEmail("123@qq.com");
        return user;
    }
}
