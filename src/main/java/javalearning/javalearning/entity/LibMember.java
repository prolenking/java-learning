package javalearning.javalearning.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import javalearning.javalearning.common.base.BaseEntity;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhouzhiwei
 * @Date: 2018/8/21
 * @Time: 10:03
 */
public class LibMember extends BaseEntity {
    private String name;
    @TableField("phoneNumber")
    private String phoneNumber;
    /**
     * 证件号
     */
    @TableField("identificationNumber")
    private String identificationNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    @Override
    public String toString() {
        return "LibMember{" +
                "id=" + super.getId() +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", identificationNumber='" + identificationNumber + '\'' +
                '}';
    }
}
