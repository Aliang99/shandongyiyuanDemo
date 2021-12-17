package com.yiyuan.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Doctor {
    private Integer d_id;

    private String d_name;

    private String d_idCard;

    private String d_phone;

    private String d_telphone;

    private Integer d_sex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date d_birthday;

    private Integer d_age;

    private String d_email;

    private Integer k_id;
    private String k_Name; //新增字段，用于存放科室名称

    private Integer x_id;
    private String x_Name; //新增字段，用于存放学历名称

    private String d_desc;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date d_inTime;

    private Integer d_state;

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name == null ? null : d_name.trim();
    }

    public String getD_idCard() {
        return d_idCard;
    }

    public void setD_idCard(String d_idCard) {
        this.d_idCard = d_idCard == null ? null : d_idCard.trim();
    }

    public String getD_phone() {
        return d_phone;
    }

    public void setD_phone(String d_phone) {
        this.d_phone = d_phone == null ? null : d_phone.trim();
    }

    public String getD_telphone() {
        return d_telphone;
    }

    public void setD_telphone(String d_telphone) {
        this.d_telphone = d_telphone == null ? null : d_telphone.trim();
    }

    public Integer getD_sex() {
        return d_sex;
    }

    public void setD_sex(Integer d_sex) {
        this.d_sex = d_sex;
    }

    public Date getD_birthday() {
        return d_birthday;
    }

    public void setD_birthday(Date d_birthday) {
        this.d_birthday = d_birthday;
    }

    public Integer getD_age() {
        return d_age;
    }

    public void setD_age(Integer d_age) {
        this.d_age = d_age;
    }

    public String getD_email() {
        return d_email;
    }

    public void setD_email(String d_email) {
        this.d_email = d_email == null ? null : d_email.trim();
    }

    public Integer getK_id() {
        return k_id;
    }

    public void setK_id(Integer k_id) {
        this.k_id = k_id;
    }

    public Integer getX_id() {
        return x_id;
    }

    public void setX_id(Integer x_id) {
        this.x_id = x_id;
    }

    public String getD_desc() {
        return d_desc;
    }

    public void setD_desc(String d_desc) {
        this.d_desc = d_desc == null ? null : d_desc.trim();
    }

    public Date getD_inTime() {
        return d_inTime;
    }

    public void setD_inTime(Date d_inTime) {
        this.d_inTime = d_inTime;
    }

    public Integer getD_state() {
        return d_state;
    }

    public void setD_state(Integer d_state) {
        this.d_state = d_state;
    }

    public String getK_Name() {
        return k_Name;
    }

    public void setK_Name(String k_Name) {
        this.k_Name = k_Name;
    }

    public String getX_Name() {
        return x_Name;
    }

    public void setX_Name(String x_Name) {
        this.x_Name = x_Name;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "d_id=" + d_id +
                ", d_name='" + d_name + '\'' +
                ", d_idCard='" + d_idCard + '\'' +
                ", d_phone='" + d_phone + '\'' +
                ", d_telphone='" + d_telphone + '\'' +
                ", d_sex=" + d_sex +
                ", d_birthday=" + d_birthday +
                ", d_age=" + d_age +
                ", d_email='" + d_email + '\'' +
                ", k_id=" + k_id +
                ", k_Name='" + k_Name + '\'' +
                ", x_id=" + x_id +
                ", x_Name='" + x_Name + '\'' +
                ", d_desc='" + d_desc + '\'' +
                ", d_inTime=" + d_inTime +
                ", d_state=" + d_state +
                '}';
    }
}