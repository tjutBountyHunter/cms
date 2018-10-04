package com.xsl.cms.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xsl.cms.pojo.MasterReturn;
import xsl.cms.pojo.XslMaster;
import xsl.cms.pojo.XslMasterExample;

public interface XslMasterMapper {
    int countByExample(XslMasterExample example);

    int deleteByExample(XslMasterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XslMaster record);

    int insertSelective(XslMaster record);

    List<MasterReturn> selectByExample(XslMasterExample example);

    XslMaster selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XslMaster record, @Param("example") XslMasterExample example);

    int updateByExample(@Param("record") XslMaster record, @Param("example") XslMasterExample example);

    int updateByPrimaryKeySelective(XslMaster record);

    int updateByPrimaryKey(XslMaster record);
}