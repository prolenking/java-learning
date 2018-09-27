package javalearning.javalearning.service.serviceimpl;

import javalearning.javalearning.common.base.BaseServiceImpl;
import javalearning.javalearning.mapper.BookMapper;
import javalearning.javalearning.pojo.vo.lib.book.*;
import javalearning.javalearning.service.LibBookService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/8
 * @Time: 18:12
 */
@Service
public class LibBookServiceImpl extends BaseServiceImpl<BookMapper> implements LibBookService {

    @Override
    public List<LibBookVO> query(LibBookQueryVO libBookQueryVO, Long userId) {
        return this.baseMapper.query(libBookQueryVO, userId);
    }

    @Override
    public BookInsertVO add(BookInsertVO bookInsertVO, Long userId) {
        this.addInsertCommonField(bookInsertVO, userId);
        this.baseMapper.insert(bookInsertVO);
        return bookInsertVO;
    }

    @Override
    public BookUpdateVO update(BookUpdateVO bookUpdateVO, Long userId) {
        this.addUpdateCommonField(bookUpdateVO, userId);
        this.baseMapper.updateById(bookUpdateVO);
        return bookUpdateVO;
    }

    @Override
    public BookDetailVO detail(Long id, Long userId) {
        return this.baseMapper.selectBookById(id);
    }


}

