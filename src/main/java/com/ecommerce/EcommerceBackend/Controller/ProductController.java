package com.ecommerce.EcommerceBackend.Controller;

import com.ecommerce.EcommerceBackend.Dto.ProductDto;
import com.ecommerce.EcommerceBackend.Model.Product;
import com.ecommerce.EcommerceBackend.Service.ProductService;
import com.ecommerce.EcommerceBackend.Shared.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @PostMapping("/")
    public void addProduct(@RequestBody ProductDto productDto){
        productService.addProduct(productDto);
    }
    @PutMapping("/{id}")
    public void updateProduct(@PathVariable Long id, @RequestBody ProductDto productDto){
        productService.updateProduct(id,productDto);
    }
    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id){
        productService.deleteProductById(id);
    }
    @DeleteMapping("/")
    public void deleteAllProducts(){
        productService.deleteAllProducts();
    }
}
