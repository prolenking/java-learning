package javalearning.javalearning.Test;

import javalearning.javalearning.entity.LibBook;
import javalearning.javalearning.mapper.BookMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

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



    public static void main(String[] args) throws IOException {
        System.out.println("hello，welcome to our Testing project, Mr.Zhou!");
        System.out.println();
        System.out.println();
        InputStream in= Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session =sqlSessionFactory.openSession();
        BookMapper mapper=session.getMapper(BookMapper.class);
        LibBook libBook = mapper.selectBookById(14L);
        System.out.println(libBook);
    }

}
