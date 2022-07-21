package com.frank.core.dao.base;

import com.frank.core.entity.OffshoreDetectOrganization;
import com.frank.core.entity.OffshoreDetectOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OffshoreDetectOrganizationMapper {
    long countByExample(OffshoreDetectOrganizationExample example);

    int deleteByExample(OffshoreDetectOrganizationExample example);

    int deleteByPrimaryKey(Long organizationId);

    int insert(OffshoreDetectOrganization record);

    int insertSelective(OffshoreDetectOrganization record);

    List<OffshoreDetectOrganization> selectByExample(OffshoreDetectOrganizationExample example);

    OffshoreDetectOrganization selectByPrimaryKey(Long organizationId);

    int updateByExampleSelective(@Param("record") OffshoreDetectOrganization record, @Param("example") OffshoreDetectOrganizationExample example);

    int updateByExample(@Param("record") OffshoreDetectOrganization record, @Param("example") OffshoreDetectOrganizationExample example);

    int updateByPrimaryKeySelective(OffshoreDetectOrganization record);

    int updateByPrimaryKey(OffshoreDetectOrganization record);
}