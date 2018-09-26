package javalearning.javalearning.service;

import javalearning.javalearning.pojo.vo.lib.book.BookUpdateVO;
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
    /**
     * 模糊查询图书信息
     * @param libBookQueryVO
     * @param userId
     * @return
     */
    LibBookVO query(LibBookQueryVO libBookQueryVO, Long userId);

    /**
     * 插入图书信息
     * @param bookInsertVO
     * @param userId
     * @return
     */
    Integer add(BookInsertVO bookInsertVO, Long userId);

    /**
     * 更新图书信息
     * @param bookUpdateVO
     * @param userId
     * @return
     */
    Integer update(BookUpdateVO bookUpdateVO,Long userId);
}
