package javalearning.javalearning.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import javalearning.javalearning.common.base.BaseEntity;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/9/26
 * @Time: 下午2:47
 */
public class LibRecord extends BaseEntity<LibRecord> {

    /**
     * 书本id
     */
    @TableField("bookId")
    private Long bookId;
    /**
     *会员id
     */
    @TableField("memberId")
    private Long memberId;
    /**
     *是否归还
     */
    @TableField("returned")
    private Boolean returned;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Boolean getReturned() {
        return returned;
    }

    public void setReturned(Boolean returned) {
        this.returned = returned;
    }

    @Override
    public String toString() {
        return "LibRecord{" +
                "bookId=" + bookId +
                ", memberId=" + memberId +
                ", returned=" + returned +
                '}';
    }
}
