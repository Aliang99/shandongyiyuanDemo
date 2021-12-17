package com.yiyuan.service;

import com.yiyuan.mapper.XueliMapper;
import com.yiyuan.pojo.Xueli;
import com.yiyuan.pojo.XueliExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XueliService {

    @Autowired
    private XueliMapper mapper;

    /**
     * 查询学历表的全部数据
     * @return
     */
    public List<Xueli> getAll(){
        XueliExample xueliExample = new XueliExample();
        xueliExample.setOrderByClause("x_id");
        List<Xueli> xuelis = mapper.selectByExample(xueliExample);
        if (xuelis.size()==0){
            return null;
        }
        return xuelis;
    }
}
