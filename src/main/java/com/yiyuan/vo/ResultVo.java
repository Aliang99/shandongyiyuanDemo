package com.yiyuan.vo;

import com.github.pagehelper.PageInfo;

import java.util.List;

public class ResultVo<T> {

    private PageInfo<T> pageInfo;//响应的分页数据
    private List<T> list;//响应的多个对象数据
    private T obj; //响应的单个对象数据
    private String msg="ok";//响应的消息
    private Integer status=200; //状态码

    public ResultVo() {
    }

    public ResultVo(PageInfo<T> pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ResultVo(List<T> list) {
        this.list = list;
    }

    public ResultVo(T obj) {
        this.obj = obj;
    }

    public ResultVo(String msg, Integer status) {
        this.msg = msg;
        this.status = status;
    }

    public PageInfo<T> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<T> pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResultVo{" +
                "pageInfo=" + pageInfo +
                ", list=" + list +
                ", obj=" + obj +
                ", msg='" + msg + '\'' +
                ", status=" + status +
                '}';
    }
}
