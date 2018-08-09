package javalearning.javalearning.common.base;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/8
 * @Time: 14:35
 */
public class BaseEntity implements Serializable {

    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private Long createBy;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 更新人
     */
    private Long updateBy;
    /**
     * 图书馆id
     */
    private Long libId;
    /**
     * 是否被删除
     */
    private Boolean deleted;


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Long getLibId() {
        return libId;
    }

    public void setLibId(Long libId) {
        this.libId = libId;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createTime=" + createTime +
                ", createBy=" + createBy +
                ", updateTime=" + updateTime +
                ", updateBy=" + updateBy +
                ", libId=" + libId +
                ", deleted=" + deleted +
                '}';
    }
}
