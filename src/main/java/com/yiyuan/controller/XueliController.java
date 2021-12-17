package com.yiyuan.controller;

import com.yiyuan.pojo.Xueli;
import com.yiyuan.service.XueliService;
import com.yiyuan.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("xueli")
@ResponseBody
public class XueliController {

    @Autowired
    private XueliService service;

    /**
     * 查询学历表的全部数据
     * @return
     */
    @RequestMapping("all")
    public ResultVo<Xueli> getAll(){
        List<Xueli> all = service.getAll();
        if (all==null){
            return new ResultVo<>("内部出现错误，请联系管理员!",500);
        }
        return new ResultVo<>(all);
    }
}
