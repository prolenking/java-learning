package javalearning.javalearning.entity;

import javalearning.javalearning.common.base.BaseEntity;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhouzhiwei
 * @Date: 2018/8/21
 * @Time: 10:03
 */
public class LibMember extends BaseEntity {
    private Long id;
    private String name;
    private String phoneNumber;
    /**
     * 证件号
     */
    private String identificationNumber;
    /**
     * 已借走书的数量
     */
    private Integer bookNumber;
    /**
     * 借阅次数
     */
    private Integer borrowTimes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Integer getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(Integer bookNumber) {
        this.bookNumber = bookNumber;
    }

    public Integer getBorrowTimes() {
        return borrowTimes;
    }

    public void setBorrowTimes(Integer borrowTimes) {
        this.borrowTimes = borrowTimes;
    }
}
