package javalearning.javalearning.common.base;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/9
 * @Time: 10:41
 */
public interface BaseService {
    void addInsertCommonField(BaseEntity baseEntity,Long userId);
    void addUpdateCommonField(BaseEntity baseEntity,Long userId);
    void addDeleteCommonField(BaseEntity baseEntity,Long userId);
}
