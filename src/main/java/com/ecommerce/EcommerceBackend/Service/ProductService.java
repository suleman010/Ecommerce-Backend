package com.ecommerce.EcommerceBackend.Service;

import com.ecommerce.EcommerceBackend.Dto.ProductDto;
import com.ecommerce.EcommerceBackend.Model.Product;
import com.ecommerce.EcommerceBackend.Repository.ProductRepository;
import com.ecommerce.EcommerceBackend.Shared.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ApiResponse getAllProducts(){
        return new ApiResponse(HttpStatus.OK.value(), "Products found successfully", productRepository.getAllProducts());
    }

    public ApiResponse addProduct(ProductDto product){
        Product product1=new Product();
        product1.setName(product.getName());
        product1.setDescription(product.getDescription());
        product1.setPrice(product.getPrice());
        product1.setStock(product.getStock());
        return new ApiResponse(HttpStatus.OK.value(), "Products found successfully", productRepository.save(product1));
    }

}
