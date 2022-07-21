package com.frank.core.dao.base;

import com.frank.core.entity.ChinaTripartiteDetect;
import com.frank.core.entity.ChinaTripartiteDetectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChinaTripartiteDetectMapper {
    long countByExample(ChinaTripartiteDetectExample example);

    int deleteByExample(ChinaTripartiteDetectExample example);

    int deleteByPrimaryKey(Long tripartiteId);

    int insert(ChinaTripartiteDetect record);

    int insertSelective(ChinaTripartiteDetect record);

    List<ChinaTripartiteDetect> selectByExample(ChinaTripartiteDetectExample example);

    ChinaTripartiteDetect selectByPrimaryKey(Long tripartiteId);

    int updateByExampleSelective(@Param("record") ChinaTripartiteDetect record, @Param("example") ChinaTripartiteDetectExample example);

    int updateByExample(@Param("record") ChinaTripartiteDetect record, @Param("example") ChinaTripartiteDetectExample example);

    int updateByPrimaryKeySelective(ChinaTripartiteDetect record);

    int updateByPrimaryKey(ChinaTripartiteDetect record);
}