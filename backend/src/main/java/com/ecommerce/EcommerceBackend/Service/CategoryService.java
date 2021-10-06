package com.ecommerce.EcommerceBackend.Service;

import com.ecommerce.EcommerceBackend.Dto.CategoryDto;
import com.ecommerce.EcommerceBackend.Model.Category;
import com.ecommerce.EcommerceBackend.Model.SubCategory;
import com.ecommerce.EcommerceBackend.Repository.CategoryRepository;
import com.ecommerce.EcommerceBackend.Repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    SubCategoryRepository subCategoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.getCategory();
    }

//    public void addSubCategoryById(Long subCategoryId,Long categoryId){
//        SubCategory subCategory = subCategoryRepository.findAll().stream().filter(x -> Long.valueOf(x.getId()) == subCategoryId).findAny().get();
//        categoryRepository.findAll().stream().filter(x->Long.valueOf(x.getId())==categoryId).findAny().get().getSubCategories().add(subCategory);
//    }

    public void addCategory(CategoryDto category){
        Category category1=new Category();
        category1.setName(category.getName());
//        category1.setSubCategories(category.getSubCategories());
        category1.setImage(category.getImage());
        categoryRepository.save(category1);
    }

    public void deleteCategoryById(Long id){
        categoryRepository.delete(categoryRepository.findAll().stream().filter(c -> Long.valueOf(c.getId()) == id).findAny().get());
    }
    public void deleteAllCategory(){
        categoryRepository.deleteAll();
    }
}
