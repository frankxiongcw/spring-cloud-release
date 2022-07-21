package com.frank.core.dao.base;

import com.frank.core.entity.OffshorePlant;
import com.frank.core.entity.OffshorePlantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OffshorePlantMapper {
    long countByExample(OffshorePlantExample example);

    int deleteByExample(OffshorePlantExample example);

    int deleteByPrimaryKey(Long plantId);

    int insert(OffshorePlant record);

    int insertSelective(OffshorePlant record);

    List<OffshorePlant> selectByExample(OffshorePlantExample example);

    OffshorePlant selectByPrimaryKey(Long plantId);

    int updateByExampleSelective(@Param("record") OffshorePlant record, @Param("example") OffshorePlantExample example);

    int updateByExample(@Param("record") OffshorePlant record, @Param("example") OffshorePlantExample example);

    int updateByPrimaryKeySelective(OffshorePlant record);

    int updateByPrimaryKey(OffshorePlant record);
}