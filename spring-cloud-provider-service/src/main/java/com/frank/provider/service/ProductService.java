package com.frank.provider.service;

import com.frank.core.dao.base.ProductMapper;
import com.frank.core.entity.Product;
import com.frank.core.entity.ProductExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiong.canwei
 * @date 2022年07月21日 17:14
 */
@Service
public class ProductService {

    @Resource
    private ProductMapper productMapper;

    public List<Product> getAllProducts() {
        ProductExample productExample = new ProductExample();
        return productMapper.selectByExample(productExample);
    }

    public Product getProductById(Long productId){
        return productMapper.selectByPrimaryKey(productId);
    }

    public Boolean saveProduct(Product product){
        int insert = productMapper.insert(product);
        return insert>0;
    }

    public Boolean updateProduct(Product product){
        int insert = productMapper.updateByPrimaryKey(product);
        return insert>0;
    }

    public Boolean deleteProduct(Long productId){
        int insert = productMapper.deleteByPrimaryKey(productId);
        return insert>0;
    }
}
