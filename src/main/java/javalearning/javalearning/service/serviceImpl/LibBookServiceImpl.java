package javalearning.javalearning.service.serviceImpl;

import javalearning.javalearning.common.base.BaseServiceImpl;
import javalearning.javalearning.mapper.BookMapper;
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
    public LibBookVO query(LibBookQueryVO libBookQueryVO) {
        return this.baseMapper.query(libBookQueryVO);
    }
}
