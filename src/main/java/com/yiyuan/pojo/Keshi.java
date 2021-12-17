package com.yiyuan.pojo;

public class Keshi {
    private Integer k_id;

    private String keshi_name;

    public Integer getK_id() {
        return k_id;
    }

    public void setK_id(Integer k_id) {
        this.k_id = k_id;
    }

    public String getKeshi_name() {
        return keshi_name;
    }

    public void setKeshi_name(String keshi_name) {
        this.keshi_name = keshi_name == null ? null : keshi_name.trim();
    }
}