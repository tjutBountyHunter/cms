package com.xsl.cms.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xsl.cms.pojo.XslSchoolinfo;
import xsl.cms.pojo.XslSchoolinfoExample;

public interface XslSchoolinfoMapper {
    int countByExample(XslSchoolinfoExample example);

    int deleteByExample(XslSchoolinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XslSchoolinfo record);

    int insertSelective(XslSchoolinfo record);

    List<XslSchoolinfo> selectByExample(XslSchoolinfoExample example);

    XslSchoolinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XslSchoolinfo record, @Param("example") XslSchoolinfoExample example);

    int updateByExample(@Param("record") XslSchoolinfo record, @Param("example") XslSchoolinfoExample example);

    int updateByPrimaryKeySelective(XslSchoolinfo record);

    int updateByPrimaryKey(XslSchoolinfo record);
}