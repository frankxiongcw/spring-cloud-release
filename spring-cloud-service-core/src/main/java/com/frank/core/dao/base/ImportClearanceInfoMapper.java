package com.frank.core.dao.base;

import com.frank.core.entity.ImportClearanceInfo;
import com.frank.core.entity.ImportClearanceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImportClearanceInfoMapper {
    long countByExample(ImportClearanceInfoExample example);

    int deleteByExample(ImportClearanceInfoExample example);

    int deleteByPrimaryKey(Long infoId);

    int insert(ImportClearanceInfo record);

    int insertSelective(ImportClearanceInfo record);

    List<ImportClearanceInfo> selectByExample(ImportClearanceInfoExample example);

    ImportClearanceInfo selectByPrimaryKey(Long infoId);

    int updateByExampleSelective(@Param("record") ImportClearanceInfo record, @Param("example") ImportClearanceInfoExample example);

    int updateByExample(@Param("record") ImportClearanceInfo record, @Param("example") ImportClearanceInfoExample example);

    int updateByPrimaryKeySelective(ImportClearanceInfo record);

    int updateByPrimaryKey(ImportClearanceInfo record);
}