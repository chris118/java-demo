package com.hhit.demo.domain;

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
    private String account;

    @ApiModelProperty("用户密码")
    @NotNull(message = "用户密码不能为空")
    @Size(min=6, max=11, message = "密码长度必须是6-16个字符")
    private String password;

    @ApiModelProperty("用户邮箱")
    @NotNull(message = "用户邮箱不能为空")
    @Email(message = "邮箱格式不对")
    private String email;
}
