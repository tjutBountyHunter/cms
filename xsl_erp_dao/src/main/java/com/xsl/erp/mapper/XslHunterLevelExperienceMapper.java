package com.xsl.erp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xsl.erp.pojo.XslHunterLevelExperience;
import xsl.erp.pojo.XslHunterLevelExperienceExample;

public interface XslHunterLevelExperienceMapper {
    long countByExample(XslHunterLevelExperienceExample example);

    int deleteByExample(XslHunterLevelExperienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XslHunterLevelExperience record);

    int insertSelective(XslHunterLevelExperience record);

    List<XslHunterLevelExperience> selectByExample(XslHunterLevelExperienceExample example);

    XslHunterLevelExperience selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XslHunterLevelExperience record, @Param("example") XslHunterLevelExperienceExample example);

    int updateByExample(@Param("record") XslHunterLevelExperience record, @Param("example") XslHunterLevelExperienceExample example);

    int updateByPrimaryKeySelective(XslHunterLevelExperience record);

    int updateByPrimaryKey(XslHunterLevelExperience record);
}