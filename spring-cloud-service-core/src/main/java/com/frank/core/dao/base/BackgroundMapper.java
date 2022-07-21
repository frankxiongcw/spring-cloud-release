package com.frank.core.dao.base;

import com.frank.core.entity.Background;
import com.frank.core.entity.BackgroundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackgroundMapper {
    long countByExample(BackgroundExample example);

    int deleteByExample(BackgroundExample example);

    int deleteByPrimaryKey(Long backgroundId);

    int insert(Background record);

    int insertSelective(Background record);

    List<Background> selectByExample(BackgroundExample example);

    Background selectByPrimaryKey(Long backgroundId);

    int updateByExampleSelective(@Param("record") Background record, @Param("example") BackgroundExample example);

    int updateByExample(@Param("record") Background record, @Param("example") BackgroundExample example);

    int updateByPrimaryKeySelective(Background record);

    int updateByPrimaryKey(Background record);
}