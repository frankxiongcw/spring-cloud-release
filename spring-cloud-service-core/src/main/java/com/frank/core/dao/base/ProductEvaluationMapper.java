package com.frank.core.dao.base;

import com.frank.core.entity.ProductEvaluation;
import com.frank.core.entity.ProductEvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductEvaluationMapper {
    long countByExample(ProductEvaluationExample example);

    int deleteByExample(ProductEvaluationExample example);

    int deleteByPrimaryKey(Long evaluationId);

    int insert(ProductEvaluation record);

    int insertSelective(ProductEvaluation record);

    List<ProductEvaluation> selectByExample(ProductEvaluationExample example);

    ProductEvaluation selectByPrimaryKey(Long evaluationId);

    int updateByExampleSelective(@Param("record") ProductEvaluation record, @Param("example") ProductEvaluationExample example);

    int updateByExample(@Param("record") ProductEvaluation record, @Param("example") ProductEvaluationExample example);

    int updateByPrimaryKeySelective(ProductEvaluation record);

    int updateByPrimaryKey(ProductEvaluation record);
}