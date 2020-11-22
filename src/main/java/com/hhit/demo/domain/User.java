package com.hhit.demo.domain;

import com.hhit.demo.annotation.ExceptionCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author wangxiaopeng
 */
@Data
public class User {

    @ApiModelProperty("用户账号")
    @NotNull(message = "用户账号不能为空")
    @Size(min=6, max=11, message = "账号长度必须是6-16个字符")
    @ExceptionCode(value = 100001, message = "账号验证错误")
    private String account;

    @ApiModelProperty("用户密码")
    @NotNull(message = "用户密码不能为空")
    @Size(min=6, max=11, message = "密码长度必须是6-16个字符")
    @ExceptionCode(value = 100002, message = "密码验证错误")
    private String password;

    @ApiModelProperty("用户邮箱")
    @NotNull(message = "用户邮箱不能为空")
    @Email(message = "邮箱格式不对")
    @ExceptionCode(value = 100003, message = "邮箱验证错误")
    private String email;
}
