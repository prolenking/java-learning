package javalearning.javalearning.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import javalearning.javalearning.entity.LibBook;
import javalearning.javalearning.pojo.vo.lib.book.BookDetailVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookQueryVO;
import javalearning.javalearning.pojo.vo.lib.book.LibBookVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/7
 * @Time: 17:02
 */
public interface BookMapper extends BaseMapper<LibBook> {
    /**
     * 通过图书id获得详情
     *
     * @param id
     * @return BookDetailVO
     */
    BookDetailVO selectBookById(@Param("id") Long id);

    /**
     * 模糊查询书本信息
     *
     * @param libBookQueryVO
     * @param libId
     * @return
     */
    List<LibBookVO> query(@Param("LBQVO") LibBookQueryVO libBookQueryVO, @Param("libId") Long libId);

    /**
     * 通过用户ID查询用户借阅图书
     *
     * @param memberId
     * @return
     */
    LibBook selectByMemberId(@Param("memberId") Long memberId);
}
