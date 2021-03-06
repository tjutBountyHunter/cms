package com.xsl.erp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xsl.erp.pojo.XslMasterLevelExperience;
import xsl.erp.pojo.XslMasterLevelExperienceExample;

public interface XslMasterLevelExperienceMapper {
    long countByExample(XslMasterLevelExperienceExample example);

    int deleteByExample(XslMasterLevelExperienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XslMasterLevelExperience record);

    int insertSelective(XslMasterLevelExperience record);

    List<XslMasterLevelExperience> selectByExample(XslMasterLevelExperienceExample example);

    XslMasterLevelExperience selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XslMasterLevelExperience record, @Param("example") XslMasterLevelExperienceExample example);

    int updateByExample(@Param("record") XslMasterLevelExperience record, @Param("example") XslMasterLevelExperienceExample example);

    int updateByPrimaryKeySelective(XslMasterLevelExperience record);

    int updateByPrimaryKey(XslMasterLevelExperience record);
}