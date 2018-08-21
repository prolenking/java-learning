package javalearning.javalearning.common.base;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/9
 * @Time: 10:44
 *
 * M是mapper，以后我看懂前辈的思路了会有功能性的方法填充进去
 */
public class BaseServiceImpl<M> implements BaseService{

    @Override
    public void addInsertCommonField(BaseEntity baseEntity,Long userId) {
        Date date = new Date();
        baseEntity.setCreateBy(userId);
        baseEntity.setCreateTime(date);
        baseEntity.setLibId(userId);
        baseEntity.setUpdateBy(userId);
        baseEntity.setUpdateTime(date);
    }

    @Override
    public void addUpdateCommonField(BaseEntity baseEntity,Long userId) {
        Date date = new Date();
        baseEntity.setLibId(userId);
        baseEntity.setUpdateBy(userId);
        baseEntity.setUpdateTime(date);
    }

    @Override
    public void addDeleteCommonField(BaseEntity baseEntity,Long userId) {
        Date date = new Date();
        baseEntity.setDeleted(true);
        baseEntity.setLibId(userId);
        baseEntity.setUpdateBy(userId);
        baseEntity.setUpdateTime(date);
    }
}
