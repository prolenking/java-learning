package javalearning.javalearning.controller;

import javalearning.javalearning.pojo.vo.lib.book.BookInsertVO;
import javalearning.javalearning.pojo.vo.lib.book.BookUpdateVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookQueryVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookVO;
import javalearning.javalearning.service.LibBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
        return libBookService.query(libBookQueryVO,1L);
    }

    @PostMapping("/add")
    public Integer add(@Validated @RequestBody BookInsertVO bookInsertVO){
        return libBookService.add(bookInsertVO,bookInsertVO.getLibId());
    }

    @PutMapping("/update")
    public Integer update(@Validated @RequestBody BookUpdateVO bookUpdateVO){
        return libBookService.update(bookUpdateVO,1L);
    }

}
