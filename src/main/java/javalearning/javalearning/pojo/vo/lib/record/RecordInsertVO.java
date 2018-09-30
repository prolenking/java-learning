package javalearning.javalearning.pojo.vo.lib.record;

import javalearning.javalearning.entity.LibRecord;

import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/9/28
 * @Time: 下午4:10
 */
public class RecordInsertVO extends LibRecord{

    @NotNull
    private Long bookId;

    @NotNull
    private Long memberId;

    @Override
    public Long getBookId() {
        return bookId;
    }

    @Override
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    @Override
    public Long getMemberId() {
        return memberId;
    }

    @Override
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "RecordInsertVO{" +
                "bookId=" + bookId +
                ", memberId=" + memberId +
                '}';
    }
}
