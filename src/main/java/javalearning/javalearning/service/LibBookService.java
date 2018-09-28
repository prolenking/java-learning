package javalearning.javalearning.service;

import javalearning.javalearning.pojo.vo.lib.book.*;

import java.util.List;

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
     *
     * @param libBookQueryVO
     * @param userId
     * @return
     */
    List<LibBookVO> query(LibBookQueryVO libBookQueryVO, Long userId);

    /**
     * 插入图书信息
     *
     * @param bookInsertVO
     * @param userId
     * @return
     */
    BookInsertVO add(BookInsertVO bookInsertVO, Long userId);

    /**
     * 更新图书信息
     *
     * @param bookUpdateVO
     * @param userId
     * @return
     */
    BookUpdateVO update(BookUpdateVO bookUpdateVO, Long userId);

    /**
     * 图书详情
     *
     * @param id
     * @param userId
     * @return
     */
    BookDetailVO detail(Long id, Long userId);

    LibBookDetailVO bookMemberDetail(Long id,Long userId);

    /**
     * 图书报废方法
     *
     * @param id
     * @param userId
     * @return
     */
    Boolean delete(Long id,Long userId);
}
