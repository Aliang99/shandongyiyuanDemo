package com.yiyuan.mapper;

import com.yiyuan.pojo.Xueli;
import com.yiyuan.pojo.XueliExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XueliMapper {
    long countByExample(XueliExample example);

    int deleteByExample(XueliExample example);

    int deleteByPrimaryKey(Integer x_id);

    int insert(Xueli record);

    int insertSelective(Xueli record);

    List<Xueli> selectByExample(XueliExample example);

    Xueli selectByPrimaryKey(Integer x_id);

    int updateByExampleSelective(@Param("record") Xueli record, @Param("example") XueliExample example);

    int updateByExample(@Param("record") Xueli record, @Param("example") XueliExample example);

    int updateByPrimaryKeySelective(Xueli record);

    int updateByPrimaryKey(Xueli record);
}