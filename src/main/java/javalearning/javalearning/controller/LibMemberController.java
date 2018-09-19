package javalearning.javalearning.controller;

import javalearning.javalearning.pojo.vo.lib.member.LibMemberQueryVO;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberVO;
import javalearning.javalearning.pojo.vo.lib.member.MemberInsertVO;
import javalearning.javalearning.service.LibMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhouzhiwei
 * @Date: 2018/8/21
 * @Time: 10:03
 */
@RestController
@RequestMapping("/libmember")
public class LibMemberController {
    @Autowired
    private LibMemberService service;

    @GetMapping("/query")
    public List<LibMemberVO> query(@Validated LibMemberQueryVO libMemberQueryVO) {
        return service.query(libMemberQueryVO, 1L);
    }

    @PostMapping("/add")
    public Integer add(@Validated @RequestBody MemberInsertVO vo) {
        return service.add(vo, vo.getLibId());
    }

    @PutMapping("/update")
    public Integer update(@Validated @RequestBody LibMemberVO libMemberVO) {
        return service.update(libMemberVO);
    }

    @PutMapping("/delete/{id}")
    public Boolean delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping("/details/{id}")
    public LibMemberVO queryMemberDetails(@PathVariable(value = "id") Long id) {
        return service.queryMemberDetails(id);
    }
}
