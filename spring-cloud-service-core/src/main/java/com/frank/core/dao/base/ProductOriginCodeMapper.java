package com.frank.core.dao.base;

import com.frank.core.entity.ProductOriginCode;
import com.frank.core.entity.ProductOriginCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductOriginCodeMapper {
    long countByExample(ProductOriginCodeExample example);

    int deleteByExample(ProductOriginCodeExample example);

    int deleteByPrimaryKey(Long codeId);

    int insert(ProductOriginCode record);

    int insertSelective(ProductOriginCode record);

    List<ProductOriginCode> selectByExample(ProductOriginCodeExample example);

    ProductOriginCode selectByPrimaryKey(Long codeId);

    int updateByExampleSelective(@Param("record") ProductOriginCode record, @Param("example") ProductOriginCodeExample example);

    int updateByExample(@Param("record") ProductOriginCode record, @Param("example") ProductOriginCodeExample example);

    int updateByPrimaryKeySelective(ProductOriginCode record);

    int updateByPrimaryKey(ProductOriginCode record);
}