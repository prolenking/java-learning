package javalearning.javalearning.pojo.vo.lib;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/9
 * @Time: 10:06
 */
public class FuzzyQueryVO {
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
