package com.xsl.erp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xsl.erp.pojo.XslOrder;
import xsl.erp.pojo.XslOrderExample;

public interface XslOrderMapper {
    long countByExample(XslOrderExample example);

    int deleteByExample(XslOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XslOrder record);

    int insertSelective(XslOrder record);

    List<XslOrder> selectByExample(XslOrderExample example);

    XslOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XslOrder record, @Param("example") XslOrderExample example);

    int updateByExample(@Param("record") XslOrder record, @Param("example") XslOrderExample example);

    int updateByPrimaryKeySelective(XslOrder record);

    int updateByPrimaryKey(XslOrder record);
}