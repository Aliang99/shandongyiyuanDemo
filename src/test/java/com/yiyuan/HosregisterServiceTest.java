package com.yiyuan;

import com.github.pagehelper.PageInfo;
import com.yiyuan.controller.HosregisterController;
import com.yiyuan.pojo.Hosregister;
import com.yiyuan.service.HosregisterService;
import com.yiyuan.vo.ResultVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class HosregisterServiceTest {
    @Resource
    private HosregisterService service;

    /**
     * 测试分页+条件查询
     * 测试结果：OK
     */
    @Test
    public void testlist(){
        PageInfo<Hosregister> list = service.list(1, 5, null);
        System.out.println(list);
    }

    /**
     * 测试根据挂号id,查询挂号信息
     * 测试结果：OK
     */
    @Test
    public void testgetDataById(){
        Hosregister dataById = service.getDataById(1);
        System.out.println(dataById);
    }

}
