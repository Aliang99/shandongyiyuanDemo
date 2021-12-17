package com.yiyuan.pojo;

public class Xueli {
    private Integer x_id;

    private String x_name;

    public Integer getX_id() {
        return x_id;
    }

    public void setX_id(Integer x_id) {
        this.x_id = x_id;
    }

    public String getX_name() {
        return x_name;
    }

    public void setX_name(String x_name) {
        this.x_name = x_name == null ? null : x_name.trim();
    }
}