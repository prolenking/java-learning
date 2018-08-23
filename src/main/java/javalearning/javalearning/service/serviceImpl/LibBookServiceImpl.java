package javalearning.javalearning.service.serviceImpl;

import javalearning.javalearning.common.base.BaseServiceImpl;
import javalearning.javalearning.mapper.BookMapper;
import javalearning.javalearning.pojo.vo.lib.book.BookInsertVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookQueryVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookVO;
import javalearning.javalearning.service.LibBookService;
import org.springframework.stereotype.Service;

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
    public LibBookVO query(LibBookQueryVO libBookQueryVO, Long userId) {
        return this.baseMapper.query(libBookQueryVO, userId);
    }

    @Override
    public Integer add(BookInsertVO bookInsertVO, Long userId) {
        this.addInsertCommonField(bookInsertVO, userId);
        bookInsertVO.setLibId(userId);
        return this.baseMapper.insert(bookInsertVO);
    }


}

