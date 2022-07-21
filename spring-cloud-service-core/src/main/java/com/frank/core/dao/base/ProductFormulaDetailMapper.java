package com.frank.core.dao.base;

import com.frank.core.entity.ProductFormulaDetail;
import com.frank.core.entity.ProductFormulaDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductFormulaDetailMapper {
    long countByExample(ProductFormulaDetailExample example);

    int deleteByExample(ProductFormulaDetailExample example);

    int deleteByPrimaryKey(Long detailId);

    int insert(ProductFormulaDetail record);

    int insertSelective(ProductFormulaDetail record);

    List<ProductFormulaDetail> selectByExample(ProductFormulaDetailExample example);

    ProductFormulaDetail selectByPrimaryKey(Long detailId);

    int updateByExampleSelective(@Param("record") ProductFormulaDetail record, @Param("example") ProductFormulaDetailExample example);

    int updateByExample(@Param("record") ProductFormulaDetail record, @Param("example") ProductFormulaDetailExample example);

    int updateByPrimaryKeySelective(ProductFormulaDetail record);

    int updateByPrimaryKey(ProductFormulaDetail record);
}