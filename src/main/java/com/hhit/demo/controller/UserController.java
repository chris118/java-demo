package com.hhit.demo.controller;

import com.hhit.demo.annotation.NotResponseBody;
import com.hhit.demo.domain.User;
import com.hhit.demo.exception.APIException;
import com.hhit.demo.service.UserService;
import com.hhit.demo.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String addUser(@RequestBody @Valid User user) {
        return userService.addUser(user);
    }

    @ApiOperation("获取用户")
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {

//        throw new APIException("api exception");

//        User user = new User();
//        user.setAccount("12345678");
//        user.setPassword("12345678");
//        user.setEmail("123@qq.com");
//        return user;

        return userService.getUser(id);
    }

    @ApiOperation("获取用户 测试不返回统一响应")
    @GetMapping("/other/{id}")
    @NotResponseBody
    public User getOtherUser(@PathVariable Long id) {
        User user = new User();
        user.setAccount("12345678");
        user.setPassword("12345678");
        user.setEmail("123@qq.com");
        return user;
    }
}
