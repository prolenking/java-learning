package javalearning.javalearning.pojo.vo.lib.member;

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

    public List<LibBook> getBooks() {
        return books;
    }

    public void setBooks(List<LibBook> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "LibMemberVO{}" + super.toString();
    }
}
