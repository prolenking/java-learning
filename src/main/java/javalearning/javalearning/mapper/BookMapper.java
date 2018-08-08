package javalearning.javalearning.mapper;

import javalearning.javalearning.entity.ShopBook;
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
public interface BookMapper {
    ShopBook selectBookById(@Param("id") Long id);
}
