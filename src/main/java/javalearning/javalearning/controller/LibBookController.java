package javalearning.javalearning.controller;

import javalearning.javalearning.pojo.vo.LibResponse;
import javalearning.javalearning.pojo.vo.lib.book.BookInsertVO;
import javalearning.javalearning.pojo.vo.lib.book.BookUpdateVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookQueryVO;
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
    public LibResponse query(@Validated LibBookQueryVO libBookQueryVO){
        return LibResponse.create(true).setData(libBookService.query(libBookQueryVO,1L));
    }

    @PostMapping("/add")
    public LibResponse add(@Validated @RequestBody BookInsertVO bookInsertVO){
        return LibResponse.create(true).setData(libBookService.add(bookInsertVO,bookInsertVO.getLibId()));
    }

    @PutMapping("/update")
    public LibResponse update(@Validated @RequestBody BookUpdateVO bookUpdateVO){
        return LibResponse.create(true).setData(libBookService.update(bookUpdateVO,1L));
    }

    @GetMapping("/detail/{id}")
    public LibResponse detail(@PathVariable Long id){
        return LibResponse.create(true).setData(libBookService.bookMemberDetail(id,1L));
    }

    @PutMapping("/delete/{id}")
    public LibResponse delete(@PathVariable Long id){
         return LibResponse.create(libBookService.delete(id,1L));
    }
}
