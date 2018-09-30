package javalearning.javalearning.config;

import javalearning.javalearning.pojo.vo.LibResponse;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/9/26
 * @Time: 下午5:43
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(SQLException.class)
    @ResponseBody
    public LibResponse sqlExceptionHandler(SQLException e){
        return LibResponse.create(false).setStatus(e.getErrorCode()).setData(e);
    }

}
