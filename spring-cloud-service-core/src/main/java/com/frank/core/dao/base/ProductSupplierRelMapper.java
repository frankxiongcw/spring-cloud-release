package com.frank.core.dao.base;

import com.frank.core.entity.ProductSupplierRel;
import com.frank.core.entity.ProductSupplierRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSupplierRelMapper {
    long countByExample(ProductSupplierRelExample example);

    int deleteByExample(ProductSupplierRelExample example);

    int deleteByPrimaryKey(Long relId);

    int insert(ProductSupplierRel record);

    int insertSelective(ProductSupplierRel record);

    List<ProductSupplierRel> selectByExample(ProductSupplierRelExample example);

    ProductSupplierRel selectByPrimaryKey(Long relId);

    int updateByExampleSelective(@Param("record") ProductSupplierRel record, @Param("example") ProductSupplierRelExample example);

    int updateByExample(@Param("record") ProductSupplierRel record, @Param("example") ProductSupplierRelExample example);

    int updateByPrimaryKeySelective(ProductSupplierRel record);

    int updateByPrimaryKey(ProductSupplierRel record);
}