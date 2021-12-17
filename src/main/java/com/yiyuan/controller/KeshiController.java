package com.yiyuan.controller;

import com.yiyuan.pojo.Keshi;
import com.yiyuan.service.KeshiService;
import com.yiyuan.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("keshi")
@ResponseBody
public class KeshiController {

    @Autowired
    KeshiService service;

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public ResultVo<Keshi> queryAll(){
        List<Keshi> keshis = service.queryAll();
        if (keshis==null){
            return new ResultVo<>("内部出现错误，请联系管理员!",500);
        }
        return new ResultVo<>(keshis);
    }

}
