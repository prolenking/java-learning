package javalearning.javalearning.common.base;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/9
 * @Time: 10:41
 */
public interface BaseService {
    /**
     * 插入插入操作公共信息
     *
     * @param baseEntity
     * @param userId
     */
    void addInsertCommonField(BaseEntity baseEntity, Long userId);

    /**
     * 插入更新操作公共信息
     *
     * @param baseEntity
     * @param userId
     */
    void addUpdateCommonField(BaseEntity baseEntity, Long userId);

    /**
     * 插入删除操作公共信息
     *
     * @param baseEntity
     * @param userId
     */
    void addDeleteCommonField(BaseEntity baseEntity, Long userId);
}
