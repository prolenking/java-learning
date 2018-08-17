package javalearning.javalearning.entity;

import javalearning.javalearning.common.base.BaseEntity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/7
 * @Time: 16:43
 */
public class LibBook extends BaseEntity {

    /**
     * id
     */
    private Long id;

    /**
     * 书籍名称
     */
    private String name;

    /**
     * 作者姓名
     */
    private String author;

    /**
     * 国际书本认证码
     */
    private String isbn;

    /**
     * 出版地
     */
    private String placeOfPublication;

    /**
     * 出版日期
     */
    private Date publicationDate;

    /**
     * 出版社
     */
    private String press;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPlaceOfPublication() {
        return placeOfPublication;
    }

    public void setPlaceOfPublication(String placeOfPublication) {
        this.placeOfPublication = placeOfPublication;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    @Override
    public String toString() {
        return "LibBook{" +
                "id=" + id +
                ", \nname='" + name + '\'' +
                ", \nauthor='" + author + '\'' +
                ", \nisbn='" + isbn + '\'' +
                ", \nplaceOfPublication='" + placeOfPublication + '\'' +
                ", \npublicationDate=" + publicationDate +
                ", \npress='" + press + '\'' +super.toString()+
                '}';
    }
}
