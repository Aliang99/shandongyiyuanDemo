package com.yiyuan.service;

import com.yiyuan.mapper.KeshiMapper;
import com.yiyuan.pojo.Keshi;
import com.yiyuan.pojo.KeshiExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeshiService {
    @Autowired
    private KeshiMapper mapper;

    /**
     * 查询全部科室
     * @return
     */
    public List<Keshi> queryAll(){
        KeshiExample keshiExample = new KeshiExample();
        keshiExample.setOrderByClause("k_id");

        List<Keshi> keshis = mapper.selectByExample(keshiExample);
        if (keshis.size()==0){
            return null;
        }
        return keshis;
    }
}
