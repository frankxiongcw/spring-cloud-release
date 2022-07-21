package com.frank.core.dao.base;

import com.frank.core.entity.ForetasteApply;
import com.frank.core.entity.ForetasteApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForetasteApplyMapper {
    long countByExample(ForetasteApplyExample example);

    int deleteByExample(ForetasteApplyExample example);

    int deleteByPrimaryKey(Long applyId);

    int insert(ForetasteApply record);

    int insertSelective(ForetasteApply record);

    List<ForetasteApply> selectByExample(ForetasteApplyExample example);

    ForetasteApply selectByPrimaryKey(Long applyId);

    int updateByExampleSelective(@Param("record") ForetasteApply record, @Param("example") ForetasteApplyExample example);

    int updateByExample(@Param("record") ForetasteApply record, @Param("example") ForetasteApplyExample example);

    int updateByPrimaryKeySelective(ForetasteApply record);

    int updateByPrimaryKey(ForetasteApply record);
}