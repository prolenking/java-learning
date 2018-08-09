package javalearning.javalearning.service.serviceImpl;

import javalearning.javalearning.common.base.BaseServiceImpl;
import javalearning.javalearning.mapper.BookMapper;
import javalearning.javalearning.pojo.vo.lib.book.BookInsertVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookQueryVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookVO;
import javalearning.javalearning.service.LibBookService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.InputStream;

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
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
            SqlSession session = sqlSessionFactory.openSession();
            BookMapper bookMapper = session.getMapper(BookMapper.class);
            return bookMapper.query(libBookQueryVO, userId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Boolean add(BookInsertVO bookInsertVO, Long userId) {
        try{
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
            SqlSession session = sqlSessionFactory.openSession();
            BookMapper bookMapper = session.getMapper(BookMapper.class);
            this.addInsertCommonField(bookInsertVO,userId);
            bookMapper.add(bookInsertVO,userId);
            session.commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}

