package com.ecommerce.EcommerceBackend.Controller;

import com.ecommerce.EcommerceBackend.Dto.ProductDto;
import com.ecommerce.EcommerceBackend.Model.Product;
import com.ecommerce.EcommerceBackend.Service.ProductService;
import com.ecommerce.EcommerceBackend.Shared.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public ApiResponse<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/")
    public ApiResponse<Product> addProduct(@RequestBody ProductDto productDto){
        return productService.addProduct(productDto);
    }
}
