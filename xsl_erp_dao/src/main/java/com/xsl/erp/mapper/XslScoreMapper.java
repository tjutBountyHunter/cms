package com.xsl.erp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xsl.erp.pojo.XslScore;
import xsl.erp.pojo.XslScoreExample;

public interface XslScoreMapper {
    long countByExample(XslScoreExample example);

    int deleteByExample(XslScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XslScore record);

    int insertSelective(XslScore record);

    List<XslScore> selectByExample(XslScoreExample example);

    XslScore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XslScore record, @Param("example") XslScoreExample example);

    int updateByExample(@Param("record") XslScore record, @Param("example") XslScoreExample example);

    int updateByPrimaryKeySelective(XslScore record);

    int updateByPrimaryKey(XslScore record);
}