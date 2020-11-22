package com.hhit.demo.config;

import com.hhit.demo.exception.APIException;
import com.hhit.demo.vo.ResultVO;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO<String> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException exception) {
        ObjectError objectError = exception.getBindingResult().getAllErrors().get(0);

        return new ResultVO<>(1001, "参数校验失败", objectError.getDefaultMessage());
    }

    @ExceptionHandler(APIException.class)
    public ResultVO<String> apiExceptionHandler(APIException exception) {
        return new ResultVO<>(exception.getCode(), "响应失败",exception.getMsg());
    }
}
