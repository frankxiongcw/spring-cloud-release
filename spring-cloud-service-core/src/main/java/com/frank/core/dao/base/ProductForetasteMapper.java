package com.frank.core.dao.base;

import com.frank.core.entity.ProductForetaste;
import com.frank.core.entity.ProductForetasteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductForetasteMapper {
    long countByExample(ProductForetasteExample example);

    int deleteByExample(ProductForetasteExample example);

    int deleteByPrimaryKey(Long foretasteId);

    int insert(ProductForetaste record);

    int insertSelective(ProductForetaste record);

    List<ProductForetaste> selectByExample(ProductForetasteExample example);

    ProductForetaste selectByPrimaryKey(Long foretasteId);

    int updateByExampleSelective(@Param("record") ProductForetaste record, @Param("example") ProductForetasteExample example);

    int updateByExample(@Param("record") ProductForetaste record, @Param("example") ProductForetasteExample example);

    int updateByPrimaryKeySelective(ProductForetaste record);

    int updateByPrimaryKey(ProductForetaste record);
}