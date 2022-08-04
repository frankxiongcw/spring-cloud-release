package com.frank.caller.feign;

import com.frank.caller.feign.fallback.ProductServiceFallback;
import com.frank.core.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xiong.canwei
 * @date 2022年07月21日 16:42
 */
@FeignClient(name="spring-cloud-provider-service",fallback = ProductServiceFallback.class)
@RequestMapping("/product/")
public interface ProductServiceFeign {

    @GetMapping(value = "list")
    List<Product> getProduct();

    @GetMapping(value = "info/{productId}")
    Product getProductById(@PathVariable Long productId);

    @PostMapping(value = "save")
    Boolean saveProduct(@RequestBody Product product);

    @PostMapping(value = "update")
    Boolean updateProduct(@RequestBody Product product);

    @GetMapping(value = "del/{productId}")
    Boolean deleteProduct(@PathVariable Long productId);
}
