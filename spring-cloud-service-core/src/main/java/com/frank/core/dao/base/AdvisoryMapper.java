package com.frank.core.dao.base;

import com.frank.core.entity.Advisory;
import com.frank.core.entity.AdvisoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvisoryMapper {
    long countByExample(AdvisoryExample example);

    int deleteByExample(AdvisoryExample example);

    int deleteByPrimaryKey(Long advisoryId);

    int insert(Advisory record);

    int insertSelective(Advisory record);

    List<Advisory> selectByExample(AdvisoryExample example);

    Advisory selectByPrimaryKey(Long advisoryId);

    int updateByExampleSelective(@Param("record") Advisory record, @Param("example") AdvisoryExample example);

    int updateByExample(@Param("record") Advisory record, @Param("example") AdvisoryExample example);

    int updateByPrimaryKeySelective(Advisory record);

    int updateByPrimaryKey(Advisory record);
}