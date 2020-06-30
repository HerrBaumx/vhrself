package org.jxiao.vhrself.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class JobLevel {
    private Integer id;

    private String name;

    private String titleLevel;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss" ,timezone="Asia/Shanghai")
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitleLevel() {
        return titleLevel;
    }

    public void setTitleLevel(String titleLevel) {
        this.titleLevel = titleLevel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private Boolean enabled;

}