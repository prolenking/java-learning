package javalearning.javalearning.controller;

import javalearning.javalearning.pojo.vo.lib.book.LibBookQueryVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookVO;
import javalearning.javalearning.service.LibBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/9
 * @Time: 10:01
 */
@RestController
@RequestMapping("/libbook")
public class LibBookController {

    @Autowired
    LibBookService libBookService;

    @GetMapping("/query")
    public LibBookVO query(@Validated LibBookQueryVO libBookQueryVO){
        return libBookService.query(libBookQueryVO);
    }

}
