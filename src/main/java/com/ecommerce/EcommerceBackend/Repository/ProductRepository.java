package com.ecommerce.EcommerceBackend.Repository;


import com.ecommerce.EcommerceBackend.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query(value = "select * from products",nativeQuery = true)
    public List<Product> getAllProducts();
    @Query(value = "select * from products WHERE id=:id",nativeQuery = true)
    public Product getProductById(Long id);

//    @Query(value="select * from products",nativeQuery = true)
//    public List<Product> addProduct();


}
