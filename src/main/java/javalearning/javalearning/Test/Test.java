package javalearning.javalearning.Test;

import javalearning.javalearning.mapper.BookMapper;
import javalearning.javalearning.pojo.vo.lib.book.BookInsertVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/7
 * @Time: 14:56
 *
 * 此类仅用于测试项目能够正常运行，如需测试项目内容能够正常运行，请进入test.javalearning.javalearning创建测试类。
 * */

public class Test {
    @Autowired
    private BookMapper bookMapper;

    public static void main(String[] args) throws IOException {
        System.out.println("hello，welcome to our Testing project, Mr.Zhou!");
        System.out.println(new Date());
        System.out.println();

        BookInsertVO bookInsertVO = new BookInsertVO();
        bookInsertVO.setName("HarryPotter");
    }
}
