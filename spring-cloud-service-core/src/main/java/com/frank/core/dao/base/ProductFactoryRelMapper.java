package com.frank.core.dao.base;

import com.frank.core.entity.ProductFactoryRel;
import com.frank.core.entity.ProductFactoryRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductFactoryRelMapper {
    long countByExample(ProductFactoryRelExample example);

    int deleteByExample(ProductFactoryRelExample example);

    int deleteByPrimaryKey(Long relId);

    int insert(ProductFactoryRel record);

    int insertSelective(ProductFactoryRel record);

    List<ProductFactoryRel> selectByExample(ProductFactoryRelExample example);

    ProductFactoryRel selectByPrimaryKey(Long relId);

    int updateByExampleSelective(@Param("record") ProductFactoryRel record, @Param("example") ProductFactoryRelExample example);

    int updateByExample(@Param("record") ProductFactoryRel record, @Param("example") ProductFactoryRelExample example);

    int updateByPrimaryKeySelective(ProductFactoryRel record);

    int updateByPrimaryKey(ProductFactoryRel record);
}