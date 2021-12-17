package com.yiyuan.controller;

import com.github.pagehelper.PageInfo;
import com.yiyuan.Exception.MyParamException;
import com.yiyuan.pojo.Doctor;
import com.yiyuan.service.DoctorService;
import com.yiyuan.vo.DoctorVo;
import com.yiyuan.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用于处理门诊医生管理页面的CRUD
 *  1、新生信息查询（条件+分页）
 *  2、更改医生信息
 *  3、查看医生详细信息
 *  4、添加医生信息
 *  5、医生离职
 *  6、导出为excel
 */
@Controller
@RequestMapping("doctor")
@ResponseBody
public class DoctorController {

    @Autowired
    private DoctorService service;

    /**
     * 根据科室id获取医生集合
     * @param Kid
     * @return
     */
    @RequestMapping(value = "queryByKid/{Kid}",method = RequestMethod.GET)
    public ResultVo<Doctor> getDoctorByKID(@PathVariable("Kid") Integer Kid){

        List<Doctor> doctorByKID = service.getDoctorByKID(Kid);
        return new ResultVo<Doctor>(doctorByKID);
    }

    /**
     * 分页+模糊查
     * @param pageNum
     * @param pageSize
     * @param vo
     * @return
     */
    @RequestMapping("list")
    public ResultVo<Doctor> list(Integer pageNum, Integer pageSize, DoctorVo vo){
        if (pageNum==null || pageNum<=0){
            pageNum=1;
        }
        if (pageSize == null ||pageSize<=0){
            pageSize=5;
        }
        PageInfo<Doctor> pageInfo = service.list(pageNum, pageSize, vo);
        if (pageInfo == null){
            return new ResultVo<>("暂未开放该科室："+vo.getkName(),205);
        }else{
            return new ResultVo<>(pageInfo);
        }
    }
    /**
     * 根据医生id查询挂号信息
     * @param dId
     * @return
     */
    @RequestMapping(value = "{dId}",method = RequestMethod.GET)
    public ResultVo<Doctor> getDataById(@PathVariable("dId") Integer dId){
        Doctor dataById = null;
        if (dId!=null && dId>0){
            dataById = service.getDataById(dId);
        }
        return new ResultVo<>(dataById);
    }
    /**
     * 修改医生信息
     * @param doctor
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResultVo updateDoctor(Doctor doctor) throws Exception {
        System.out.println(doctor);
        if (doctor==null){
            return new ResultVo("抱歉，您的参数有误，请仔细核对后再提交");
        }
        if (doctor.getD_id()<=0 || doctor.getX_id()<=0){
            return new ResultVo("很抱歉，您未选择科室或者学历！",205);
        }
        Integer update = service.updateDoctor(doctor);
        if (update==1){
            return new ResultVo();
        }else{
            return new ResultVo("数据修改有误，请联系管理员！",205);
        }
    }

    /**
     * 添加医生信息
     * @param doctor
     * @return
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResultVo addDoctor(Doctor doctor) throws Exception {
        if (doctor!=null){
            Integer add = service.addDoctor(doctor);
            if (add == null){
                return new ResultVo("请正确输入出生年月",205);
            }else if(add == 1){
                return new ResultVo("医生信息录入成功",200);
            }else{
                return new ResultVo("数据插入失败，请联系管理员",205);
            }
        }else{
            return new ResultVo("请检查表单项是否有遗漏后再试...");
        }
    }

    /**
     * 根据医生id,更改医生为离职状态
     * @return
     */
    @RequestMapping(value = "{dId}",method = RequestMethod.DELETE)
    public ResultVo delByDid(@PathVariable("dId") Integer dId) throws MyParamException {
        if (dId==null || dId<=0){
            return new ResultVo("抱歉，传递的id值有问题",500);
        }
        Integer i = service.delByDid(dId);
        if (i==1){
            return new ResultVo();
        }else{
            return new ResultVo("操作失败，请联系管理员",500);
        }
    }

    /**
     * 批量离职
     * @param ids
     * @return
     */
    @RequestMapping(value = "delAll",method = RequestMethod.DELETE)
    public ResultVo delAll(@RequestParam("ids") List<Integer> ids) throws MyParamException {
        if (ids==null || ids.size()<=0){
            return new ResultVo("抱歉，您的参数有误，请仔细核对后再提交");
        }
        Integer del = service.delAll(ids); //如果service不发生异常，即说明全部成功了，直接返回响应信息即可
        return new ResultVo("已全部办理离职",200);
    }

}
