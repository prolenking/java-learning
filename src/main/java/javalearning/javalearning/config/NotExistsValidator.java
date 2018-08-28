package javalearning.javalearning.config;

import javalearning.javalearning.common.base.BaseService;
import javalearning.javalearning.common.base.BaseServiceImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/27
 * @Time: 20:32
 */
public class NotExistsValidator implements ConstraintValidator<NotExists, Object> {

    private String fieldName;
    private Long shopId;

    private Class<? extends BaseServiceImpl> baseService;

    public NotExistsValidator() {
    }

    @Override
    public void initialize(NotExists notExists) {
        this.fieldName = notExists.fieldName();
        this.shopId = new Long(notExists.shopId());
        this.baseService=notExists.baseService();
    }


    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null || s.equalsIgnoreCase("")) {
            return true;
        }
        try {
            BaseService baseService=this.baseService.newInstance();
            /**
             * 尝试完善一下？
             * ignoreId只忽略哪些特殊的数据，一般可为空
             * baseService.checkExist(FieldName,value,shopId,ignoreId)
             */
//            return baseService.checkExist(this.fieldName,s,this.shopId,null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return false;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return false;
        }
        //为了不报错才写的，上面的完善了就不用了。
        return true;
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        String s=(String)o;
        return isValid(s,constraintValidatorContext);
    }

}
