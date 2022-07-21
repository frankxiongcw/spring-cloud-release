package com.frank.core.dao.base;

import com.frank.core.entity.PortRegulatory;
import com.frank.core.entity.PortRegulatoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PortRegulatoryMapper {
    long countByExample(PortRegulatoryExample example);

    int deleteByExample(PortRegulatoryExample example);

    int deleteByPrimaryKey(Long regulatoryId);

    int insert(PortRegulatory record);

    int insertSelective(PortRegulatory record);

    List<PortRegulatory> selectByExample(PortRegulatoryExample example);

    PortRegulatory selectByPrimaryKey(Long regulatoryId);

    int updateByExampleSelective(@Param("record") PortRegulatory record, @Param("example") PortRegulatoryExample example);

    int updateByExample(@Param("record") PortRegulatory record, @Param("example") PortRegulatoryExample example);

    int updateByPrimaryKeySelective(PortRegulatory record);

    int updateByPrimaryKey(PortRegulatory record);
}