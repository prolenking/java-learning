package javalearning.javalearning.pojo.vo.lib.book;

import javalearning.javalearning.pojo.vo.lib.member.LibBookMemberDetailVO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 用于展示带有借阅用户信息的图书详情
 *
 * @Author: liz
 * @Date: 2018/9/27
 * @Time: 下午3:36
 */
public class LibBookDetailVO {
    private BookDetailVO bookInfo;
    private List<LibBookMemberDetailVO> memberInfo;

    public BookDetailVO getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookDetailVO bookInfo) {
        this.bookInfo = bookInfo;
    }

    public List<LibBookMemberDetailVO> getMemberInfo() {
        return memberInfo;
    }

    public void setMemberInfo(List<LibBookMemberDetailVO> memberInfo) {
        this.memberInfo = memberInfo;
    }

    @Override
    public String toString() {
        return "LibBookDetailVO{" +
                "bookInfo=" + bookInfo +
                ", memberInfo=" + memberInfo +
                '}';
    }
}
