package javalearning.javalearning.pojo.vo.lib.member;

import com.baomidou.mybatisplus.annotations.TableField;
import javalearning.javalearning.entity.LibBook;
import javalearning.javalearning.entity.LibMember;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhouzhiwei
 * @Date: 2018/8/21
 * @Time: 10:03
 */
public class LibMemberVO extends LibMember {
    private List<LibBook> books;

    private Integer bookNumber;

    private Integer borrowTimes;

    public List<LibBook> getBooks() {
        return books;
    }

    public void setBooks(List<LibBook> books) {
        this.books = books;
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

    @Override
    public String toString() {
        return "LibMemberVO{}" + super.toString();
    }
}
