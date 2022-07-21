package com.frank.caller.controller;

import com.frank.caller.feign.ProductServiceFeign;
import com.frank.core.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xiong.canwei
 * @date 2022年07月21日 16:52
 */
@RestController
@RequestMapping(value = "/caller/product")
public class ProductController {

    @Autowired
    private ProductServiceFeign productServiceFeign;

    @GetMapping(value = "list")
    public List<Product> getProduct(){
        return productServiceFeign.getProduct();
    }

    @GetMapping(value = "info/{productId}")
    public Product getProductById(@PathVariable Long productId){
        return productServiceFeign.getProductById(productId);
    }

    @PostMapping(value = "save")
    public Boolean saveProduct(@RequestBody Product product){
        return productServiceFeign.saveProduct(product);
    }

    @PostMapping(value = "update")
    public Boolean updateProduct(@RequestBody Product product){
        return productServiceFeign.updateProduct(product);
    }

    @GetMapping(value = "del/{productId}")
    public Boolean deleteProduct(@PathVariable Long productId){
        return productServiceFeign.deleteProduct(productId);
    }
}
