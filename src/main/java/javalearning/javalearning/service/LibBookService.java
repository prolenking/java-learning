package javalearning.javalearning.service;

import javalearning.javalearning.pojo.vo.lib.book.LibBookQueryVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookVO;
import javalearning.javalearning.pojo.vo.lib.book.BookInsertVO;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/8
 * @Time: 18:12
 */
public interface LibBookService {
    LibBookVO query(LibBookQueryVO libBookQueryVO, Long userId);
    Integer add(BookInsertVO bookInsertVO, Long userId);
}
