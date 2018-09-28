package javalearning.javalearning.pojo.vo.lib.member;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/9/27
 * @Time: 下午5:39
 */
public class LibBookMemberDetailVO {
    private Long id;
    private String name;
    private String phoneNumber;
    private String identificationNumber;
    private Boolean returned;
    private Date borrowTime;
    private Date returnTime;

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

    public Boolean getReturned() {
        return returned;
    }

    public void setReturned(Boolean returned) {
        this.returned = returned;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public Date getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    @Override
    public String toString() {
        return "LibBookMemberDetailVO{" +
                "id=" + id +
                ", name=" + name +
                ", phoneNumebr='" + phoneNumber + '\'' +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", borrowTime=" + borrowTime +
                ", returnTime=" + returnTime +
                '}';
    }
}
