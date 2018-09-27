package javalearning.javalearning.config;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/9/26
 * @Time: 下午5:43
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    /**
     * 用于测试异常处理方法（可用）
     */
//    @ExceptionHandler(HttpMessageNotReadableException.class)
//    @ResponseBody
//    public  String testErrorHandler(){
//        return "badrequest";
//    }
}
