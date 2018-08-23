package javalearning.javalearning.pojo.vo.lib.member;

import javalearning.javalearning.entity.LibMember;

import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhouzhiwei
 * @Date: 2018/8/21
 * @Time: 10:03
 */
public class MemberInsertVO extends LibMember {
    @NotNull(message = "libId can't be null")
    private Long libId;

    @Override
    public Long getLibId() {
        return libId;
    }

    @Override
    public void setLibId(Long libId) {
        this.libId = libId;
    }

    @Override
    public String toString() {
        return "MemberInsertVO{" +
                "libId=" + libId +
                '}';
    }
}
