package javalearning.javalearning.service.serviceImpl;

import javalearning.javalearning.common.base.BaseServiceImpl;
import javalearning.javalearning.mapper.BookMapper;
import javalearning.javalearning.pojo.vo.lib.book.BookInsertVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookQueryVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookVO;
import javalearning.javalearning.service.LibBookService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private BookMapper bookMapper;



    @Override
    public LibBookVO query(LibBookQueryVO libBookQueryVO, Long userId) {
        return bookMapper.query(libBookQueryVO, userId);
    }

    @Override
    public Boolean add(BookInsertVO bookInsertVO, Long userId) {
        this.addInsertCommonField(bookInsertVO, userId);
        bookMapper.add(bookInsertVO, userId);
        return true;
    }


}

