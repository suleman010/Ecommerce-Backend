package com.ecommerce.EcommerceBackend.Service;

import com.ecommerce.EcommerceBackend.Dto.ProductDto;
import com.ecommerce.EcommerceBackend.Model.Product;
import com.ecommerce.EcommerceBackend.Repository.ProductRepository;
import com.ecommerce.EcommerceBackend.Shared.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.getAllProducts();
    }
    public Product getProductById(Long id){
        return productRepository.getProductById(id);
    }

    public void addProduct(ProductDto product){
        Product product1=new Product();
        product1.setName(product.getName());
        product1.setDescription(product.getDescription());
        product1.setPrice(product.getPrice());
        product1.setStock(product.getStock());
        productRepository.save(product1);
    }

    public void updateProduct(Long id,ProductDto product){
        Product product1=new Product();
        product1.setName(product.getName());
        product1.setDescription(product.getDescription());
        product1.setPrice(product.getPrice());
        product1.setStock(product.getStock());
        productRepository.save(product1);
    }
    public void deleteProductById(Long id){
        productRepository.delete(productRepository.findAll().stream().filter(c -> Long.valueOf(c.getId()) == id).findAny().get());
    }
    public void deleteAllProducts(){
        productRepository.deleteAll();
    }
}
