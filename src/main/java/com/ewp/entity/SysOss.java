package com.ewp.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_oss")
public class SysOss {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * URL地址
     */
    private String url;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取URL地址
     *
     * @return url - URL地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置URL地址
     *
     * @param url URL地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}