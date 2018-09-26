package javalearning.javalearning.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import javalearning.javalearning.entity.LibBook;
import javalearning.javalearning.pojo.vo.lib.book.BookDetailVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookQueryVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookVO;
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
    BookDetailVO selectBookById(@Param("id") Long id);

    LibBookVO query(@Param("LBQVO") LibBookQueryVO libBookQueryVO, @Param("libId") Long libId);

    /**
     * 通过用户ID查询用户借阅图书
     *
     * @param memberId
     * @return
     */
    LibBook selectByMemberId(@Param("memberId") Long memberId);
}
