package com.yiyuan.vo;

public class DoctorVo {
    private Integer dId;
    private String dName;
    private String kName;

    public DoctorVo() {
    }

    public DoctorVo(Integer dId, String dName, String kName) {
        this.dId = dId;
        this.dName = dName;
        this.kName = kName;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName;
    }

    @Override
    public String toString() {
        return "DoctorVo{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                ", kName='" + kName + '\'' +
                '}';
    }
}
