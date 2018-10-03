package com.xsl.cms.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xsl.cms.pojo.XslMajor;
import xsl.cms.pojo.XslMajorExample;

public interface XslMajorMapper {
    int countByExample(XslMajorExample example);

    int deleteByExample(XslMajorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XslMajor record);

    int insertSelective(XslMajor record);

    List<XslMajor> selectByExample(XslMajorExample example);

    XslMajor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XslMajor record, @Param("example") XslMajorExample example);

    int updateByExample(@Param("record") XslMajor record, @Param("example") XslMajorExample example);

    int updateByPrimaryKeySelective(XslMajor record);

    int updateByPrimaryKey(XslMajor record);
}