package com.yiyuan.controller;

import com.github.pagehelper.PageInfo;
import com.yiyuan.Exception.MyParamException;
import com.yiyuan.pojo.Hosregister;
import com.yiyuan.service.HosregisterService;
import com.yiyuan.vo.HosregisterVo;
import com.yiyuan.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用于处理挂号页面的功能点
 *  1、分页+条件查询
 *  2、门诊挂号
 *  3、新退号
 *  4、修改挂号信息
 *  5、查询挂号详情
 *  6、导出为excel
 */
@Controller
@RequestMapping("hosregister")
@ResponseBody
public class HosregisterController {

    @Autowired
    private HosregisterService service;

    /**
     * 用于处理分页+条件查询
     * @param pageNum
     * @param pageSize
     * @param vo
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResultVo<Hosregister> list(Integer pageNum, Integer pageSize, HosregisterVo vo){
        if (pageNum==null || pageNum<=0){
            pageNum=1;
        }
        if (pageSize == null ||pageSize<=0){
            pageSize=5;
        }
        PageInfo<Hosregister> pageInfo=service.list(pageNum,pageSize,vo);
        return new ResultVo<Hosregister>(pageInfo);
    }

    /**
     * 根据id查询挂号信息
     * @param hosrId
     * @return
     */
    @RequestMapping(value = "{hosrId}",method = RequestMethod.GET)
    public ResultVo<Hosregister> getDataById(@PathVariable("hosrId") Integer hosrId){
        Hosregister dataById = null;
        if (hosrId!=null && hosrId>0){
            dataById = service.getDataById(hosrId);
        }
        return new ResultVo<>(dataById);
    }

    /**
     * 添加挂号信息
     * @param hosregister
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResultVo addHosregister(Hosregister hosregister){
        if (hosregister.getD_id()==-1 || hosregister.getK_id()==-1){
            return new ResultVo("很抱歉，您未选择医生或者科室！",205);
        }
        Integer insert = service.addhosregister(hosregister);
        if (insert==1){
            return new ResultVo();
        }else{
            return new ResultVo("数据录入有误，请联系管理员！",205);
        }

    }

    /**
     * 修改挂号信息
     * @param hosregister
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResultVo updateHosregister(Hosregister hosregister){
        if (hosregister==null){
            return new ResultVo("抱歉，您的参数有误，请仔细核对后再提交");
        }
        if (hosregister.getD_id()==-1 || hosregister.getK_id()==-1){
            return new ResultVo("很抱歉，您未选择医生或者科室！",205);
        }
        Integer update = service.updatehosregister(hosregister);
        if (update==1){
            return new ResultVo();
        }else{
            return new ResultVo("数据修改有误，请联系管理员！",205);
        }
    }

    /**
     * 退号
     * @param id
     * @return
     */
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public ResultVo delHosregister(@PathVariable("id")Integer id) throws MyParamException {
        if (id==null || id<=0){
            return new ResultVo("抱歉，您的参数有误，请仔细核对后再提交");
        }
        Integer del = service.delhosregister(id);
        if (del==1){
            return new ResultVo();
        }else{
            return new ResultVo("退号失败，请联系管理员！",205);
        }
    }

    /**
     * 批量退号
     * @param ids
     * @return
     */
    @RequestMapping(value = "delAll",method = RequestMethod.DELETE)
    public ResultVo delallHosregister(@RequestParam("ids") List<Integer> ids) throws MyParamException {
        if (ids==null || ids.size()<=0){
            return new ResultVo("抱歉，您的参数有误，请仔细核对后再提交");
        }
        Integer del = service.delallhosregister(ids);
        if (del==0){
            return new ResultVo("您选择的挂号记录已是退号状态，请勿重复操作",205);
        }else if (del == ids.size()){
           return new ResultVo("已全部退号",200);
        }else{
            return new ResultVo("您选择的挂号记录包含已是退号状态的记录，请勿重复操作",205);
        }
    }
}
