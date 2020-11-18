package com.hhit.demo.config;

import com.hhit.demo.exception.APIException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException exception) {
        ObjectError objectError = exception.getBindingResult().getAllErrors().get(0);

        return objectError.getDefaultMessage();
    }

    @ExceptionHandler(APIException.class)
    public String apiExceptionHandler(APIException exception) {
        return exception.getMsg();
    }
}
