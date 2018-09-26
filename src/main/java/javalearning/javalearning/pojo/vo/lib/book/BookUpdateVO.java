package javalearning.javalearning.pojo.vo.lib.book;

import javalearning.javalearning.entity.LibBook;

import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/9
 * @Time: 15:34
 */
public class BookUpdateVO extends LibBook {

    @NotNull(message = "Id can't be null!")
    private Long id;

    @NotNull(message = "libId can't be null!")
    private Long libId;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

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
        return "BookInsertVO{" +
                "libId=" + libId +
                '}';
    }


}
