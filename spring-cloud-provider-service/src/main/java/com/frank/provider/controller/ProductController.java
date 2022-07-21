package com.frank.provider.controller;

import com.frank.core.entity.Product;
import com.frank.provider.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xiong.canwei
 * @date 2022年07月21日 16:33
 */
@RestController
@RequestMapping(value = "/product/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "list")
    public List<Product> getProduct(){
        return productService.getAllProducts();
    }

    @GetMapping(value = "info/{productId}")
    public Product getProductById(@PathVariable Long productId){
        return productService.getProductById(productId);
    }

    @PostMapping(value = "save")
    public Boolean saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PostMapping(value = "update")
    public Boolean updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @GetMapping(value = "del/{productId}")
    public Boolean deleteProduct(@PathVariable Long productId){
        return productService.deleteProduct(productId);
    }
}
