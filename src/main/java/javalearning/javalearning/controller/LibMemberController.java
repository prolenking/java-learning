package javalearning.javalearning.controller;

import javalearning.javalearning.pojo.vo.lib.member.LibMemberQueryVO;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberVO;
import javalearning.javalearning.pojo.vo.lib.member.MemberInsertVO;
import javalearning.javalearning.service.LibMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    public LibMemberVO query(@Validated LibMemberQueryVO libMemberQueryVO) {
        return service.query(libMemberQueryVO, 1L);
    }

    @PostMapping("/add")
    public Boolean add(@Validated @RequestBody MemberInsertVO vo) {
        return service.add(vo, vo.getLibId());
    }
}
