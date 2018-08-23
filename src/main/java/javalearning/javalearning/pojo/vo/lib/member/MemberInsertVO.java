package javalearning.javalearning.pojo.vo.lib.member;

import javalearning.javalearning.entity.LibMember;

import javax.validation.constraints.NotNull;

public class MemberInsertVO extends LibMember {
    @NotNull(message = "libId can't be null")
    private Long libId;

    public Long getLibId() {
        return libId;
    }

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
