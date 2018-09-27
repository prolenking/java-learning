package javalearning.javalearning.pojo.vo;

import org.hibernate.validator.constraints.Length;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/9
 * @Time: 10:06
 */
public class FuzzyQueryVO {
    @Length(min=1,max = 30,message = "length 1-30!")
    private String keywords;

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "FuzzyQueryVO{" +
                "keywords='" + keywords + '\'' +
                '}';
    }
}
