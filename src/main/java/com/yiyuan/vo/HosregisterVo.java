package com.yiyuan.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class HosregisterVo {
    private Integer hosRId; // 病历号

    private String dName;//医生姓名

    private String keshiName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT")
    private Date beginTime;//挂号起始时间范围
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT")
    private Date endTime;//挂号结束时间范围

    public HosregisterVo() {
    }

    public HosregisterVo(Integer hosRId, String dName, String keshiName, Date beginTime, Date endTime) {
        this.hosRId = hosRId;
        this.dName = dName;
        this.keshiName = keshiName;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public Integer getHosRId() {
        return hosRId;
    }

    public void setHosRId(Integer hosRId) {
        this.hosRId = hosRId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getKeshiName() {
        return keshiName;
    }

    public void setKeshiName(String keshiName) {
        this.keshiName = keshiName;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "HosregisterVo{" +
                "hosRId=" + hosRId +
                ", dName='" + dName + '\'' +
                ", keshiName='" + keshiName + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                '}';
    }
}
