package com.yiyuan.mapper;

import com.yiyuan.pojo.Keshi;
import com.yiyuan.pojo.KeshiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeshiMapper {
    long countByExample(KeshiExample example);

    int deleteByExample(KeshiExample example);

    int deleteByPrimaryKey(Integer k_id);

    int insert(Keshi record);

    int insertSelective(Keshi record);

    List<Keshi> selectByExample(KeshiExample example);

    Keshi selectByPrimaryKey(Integer k_id);

    int updateByExampleSelective(@Param("record") Keshi record, @Param("example") KeshiExample example);

    int updateByExample(@Param("record") Keshi record, @Param("example") KeshiExample example);

    int updateByPrimaryKeySelective(Keshi record);

    int updateByPrimaryKey(Keshi record);
}