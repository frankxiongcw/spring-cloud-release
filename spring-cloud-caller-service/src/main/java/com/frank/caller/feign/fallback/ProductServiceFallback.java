package com.frank.caller.feign.fallback;

import com.frank.caller.feign.ProductServiceFeign;
import com.frank.core.entity.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author xiong.canwei
 * @date 2022年08月04日 15:19
 */
@Component
@RequestMapping("/fallback/product/")
public class ProductServiceFallback implements ProductServiceFeign {
    @Override
    public List<Product> getProduct() {
        return null;
    }

    @Override
    public Product getProductById(Long productId) {
        Product product = new Product();
        product.setProductId(productId);
        product.setProductName("车型尚未发布");
        return product;
    }

    @Override
    public Boolean saveProduct(Product product) {
        return null;
    }

    @Override
    public Boolean updateProduct(Product product) {
        return null;
    }

    @Override
    public Boolean deleteProduct(Long productId) {
        return null;
    }
}
