package com.frank.core.dao.base;

import com.frank.core.entity.ProductFormula;
import com.frank.core.entity.ProductFormulaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductFormulaMapper {
    long countByExample(ProductFormulaExample example);

    int deleteByExample(ProductFormulaExample example);

    int deleteByPrimaryKey(Long formulaId);

    int insert(ProductFormula record);

    int insertSelective(ProductFormula record);

    List<ProductFormula> selectByExample(ProductFormulaExample example);

    ProductFormula selectByPrimaryKey(Long formulaId);

    int updateByExampleSelective(@Param("record") ProductFormula record, @Param("example") ProductFormulaExample example);

    int updateByExample(@Param("record") ProductFormula record, @Param("example") ProductFormulaExample example);

    int updateByPrimaryKeySelective(ProductFormula record);

    int updateByPrimaryKey(ProductFormula record);
}