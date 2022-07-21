package com.frank.core.dao.base;

import com.frank.core.entity.ProductSupplier;
import com.frank.core.entity.ProductSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSupplierMapper {
    long countByExample(ProductSupplierExample example);

    int deleteByExample(ProductSupplierExample example);

    int deleteByPrimaryKey(Long supplierId);

    int insert(ProductSupplier record);

    int insertSelective(ProductSupplier record);

    List<ProductSupplier> selectByExample(ProductSupplierExample example);

    ProductSupplier selectByPrimaryKey(Long supplierId);

    int updateByExampleSelective(@Param("record") ProductSupplier record, @Param("example") ProductSupplierExample example);

    int updateByExample(@Param("record") ProductSupplier record, @Param("example") ProductSupplierExample example);

    int updateByPrimaryKeySelective(ProductSupplier record);

    int updateByPrimaryKey(ProductSupplier record);
}