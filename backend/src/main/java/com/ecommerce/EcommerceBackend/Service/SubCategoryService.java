package com.ecommerce.EcommerceBackend.Service;

import com.ecommerce.EcommerceBackend.Dto.CategoryDto;
import com.ecommerce.EcommerceBackend.Dto.ProductDto;
import com.ecommerce.EcommerceBackend.Dto.SubCategoryDto;
import com.ecommerce.EcommerceBackend.Model.Category;
import com.ecommerce.EcommerceBackend.Model.Product;
import com.ecommerce.EcommerceBackend.Model.SubCategory;
import com.ecommerce.EcommerceBackend.Repository.CategoryRepository;
import com.ecommerce.EcommerceBackend.Repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryService {

    @Autowired
    SubCategoryRepository subCategoryRepository;
    @Autowired
    CategoryRepository categoryRepository;

    public List<SubCategory> getAllSubCategories(){
        return subCategoryRepository.getSubCategory();
    }

    public void addSubCategory(Long categoryId,SubCategoryDto subCategory){
        Category category = categoryRepository.findAll().stream().filter(x -> Long.valueOf(x.getId()) == categoryId).findAny().get();
        SubCategory subCategory1=new SubCategory();
        subCategory1.setName(subCategory.getName());
//        subCategory1.setSubCategories(subCategory.getSubCategories());
        subCategory1.setImage(subCategory.getImage());
        subCategoryRepository.save(subCategory1);
    }

//    public void addProductInSubCategory(Long id, ProductDto product){
//        SubCategory subCategory = subCategoryRepository.findAll().stream().filter(x -> Long.valueOf(x.getId()) == id).findAny().get();
//        Product product1=new Product();
//        product1.setName(product.getName());
//        product1.setDescription(product.getDescription());
//        product1.setPrice(product.getPrice());
//        product1.setStock(product.getStock());
////        subCategory1.setImage(product.getImage());
//        subCategory.getProducts().add(product1);
//        subCategoryRepository.save(subCategory);
//    }

    public void deleteSubCategoryById(Long id){
        subCategoryRepository.delete(subCategoryRepository.findAll().stream().filter(c -> Long.valueOf(c.getId()) == id).findAny().get());
    }
    public void deleteAllSubCategory(){
        subCategoryRepository.deleteAll();
    }
}
