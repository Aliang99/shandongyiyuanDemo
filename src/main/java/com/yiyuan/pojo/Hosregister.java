package com.yiyuan.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Hosregister {
    private Integer hosR_id;

    private String hosR_name;

    private String hosR_idCard;

    private String hosR_medical;

    private Double hosR_regPrice;

    private String hosR_phone;

    private Integer hosR_selfPrice;

    private Integer hosR_sex;

    private Integer hosR_age;

    private String hosR_work;

    private Integer hosR_lookState;

    private Integer d_id;
    private String d_Name; //新增字段  用于存放科室名称

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date hosR_time;

    private Integer k_id;

    private String k_Name;  //新增字段 用于存放科室名称

    private String hosR_remark;

    private Integer hosR_state;

    public Integer getHosR_id() {
        return hosR_id;
    }

    public void setHosR_id(Integer hosR_id) {
        this.hosR_id = hosR_id;
    }

    public String getHosR_name() {
        return hosR_name;
    }

    public void setHosR_name(String hosR_name) {
        this.hosR_name = hosR_name == null ? null : hosR_name.trim();
    }

    public String getHosR_idCard() {
        return hosR_idCard;
    }

    public void setHosR_idCard(String hosR_idCard) {
        this.hosR_idCard = hosR_idCard == null ? null : hosR_idCard.trim();
    }

    public String getHosR_medical() {
        return hosR_medical;
    }

    public void setHosR_medical(String hosR_medical) {
        this.hosR_medical = hosR_medical == null ? null : hosR_medical.trim();
    }

    public Double getHosR_regPrice() {
        return hosR_regPrice;
    }

    public void setHosR_regPrice(Double hosR_regPrice) {
        this.hosR_regPrice = hosR_regPrice;
    }

    public String getHosR_phone() {
        return hosR_phone;
    }

    public void setHosR_phone(String hosR_phone) {
        this.hosR_phone = hosR_phone == null ? null : hosR_phone.trim();
    }

    public Integer getHosR_selfPrice() {
        return hosR_selfPrice;
    }

    public void setHosR_selfPrice(Integer hosR_selfPrice) {
        this.hosR_selfPrice = hosR_selfPrice;
    }

    public Integer getHosR_sex() {
        return hosR_sex;
    }

    public void setHosR_sex(Integer hosR_sex) {
        this.hosR_sex = hosR_sex;
    }

    public Integer getHosR_age() {
        return hosR_age;
    }

    public void setHosR_age(Integer hosR_age) {
        this.hosR_age = hosR_age;
    }

    public String getHosR_work() {
        return hosR_work;
    }

    public void setHosR_work(String hosR_work) {
        this.hosR_work = hosR_work == null ? null : hosR_work.trim();
    }

    public Integer getHosR_lookState() {
        return hosR_lookState;
    }

    public void setHosR_lookState(Integer hosR_lookState) {
        this.hosR_lookState = hosR_lookState;
    }

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public Date getHosR_time() {
        return hosR_time;
    }

    public void setHosR_time(Date hosR_time) {
        this.hosR_time = hosR_time;
    }

    public Integer getK_id() {
        return k_id;
    }

    public void setK_id(Integer k_id) {
        this.k_id = k_id;
    }

    public String getHosR_remark() {
        return hosR_remark;
    }

    public void setHosR_remark(String hosR_remark) {
        this.hosR_remark = hosR_remark == null ? null : hosR_remark.trim();
    }

    public Integer getHosR_state() {
        return hosR_state;
    }

    public void setHosR_state(Integer hosR_state) {
        this.hosR_state = hosR_state;
    }

    public String getD_Name() {
        return d_Name;
    }

    public void setD_Name(String d_Name) {
        this.d_Name = d_Name;
    }

    public String getK_Name() {
        return k_Name;
    }

    public void setK_Name(String k_Name) {
        this.k_Name = k_Name;
    }

    @Override
    public String toString() {
        return "Hosregister{" +
                "hosR_id=" + hosR_id +
                ", hosR_name='" + hosR_name + '\'' +
                ", hosR_idCard='" + hosR_idCard + '\'' +
                ", hosR_medical='" + hosR_medical + '\'' +
                ", hosR_regPrice=" + hosR_regPrice +
                ", hosR_phone='" + hosR_phone + '\'' +
                ", hosR_selfPrice=" + hosR_selfPrice +
                ", hosR_sex=" + hosR_sex +
                ", hosR_age=" + hosR_age +
                ", hosR_work='" + hosR_work + '\'' +
                ", hosR_lookState=" + hosR_lookState +
                ", d_id=" + d_id +
                ", d_Name='" + d_Name + '\'' +
                ", hosR_time=" + hosR_time +
                ", k_id=" + k_id +
                ", k_Name='" + k_Name + '\'' +
                ", hosR_remark='" + hosR_remark + '\'' +
                ", hosR_state=" + hosR_state +
                '}';
    }
}