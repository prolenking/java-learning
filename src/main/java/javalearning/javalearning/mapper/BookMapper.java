package javalearning.javalearning.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import javalearning.javalearning.entity.LibBook;
import javalearning.javalearning.pojo.vo.lib.book.LibBookQueryVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookVO;
import javalearning.javalearning.pojo.vo.lib.book.BookInsertVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/7
 * @Time: 17:02
 */
@Configuration
public interface BookMapper extends BaseMapper<LibBook> {
    LibBook selectBookById(@Param("id") Long id);
    LibBookVO query(@Param("LBQVO") LibBookQueryVO libBookQueryVO, @Param("libId") Long libId);
    void add(@Param("BIVO") BookInsertVO bookInsertVO,@Param("libId") Long libId);
}
