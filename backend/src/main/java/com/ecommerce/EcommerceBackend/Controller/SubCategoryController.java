package com.ecommerce.EcommerceBackend.Controller;

import com.ecommerce.EcommerceBackend.Dto.ProductDto;
import com.ecommerce.EcommerceBackend.Dto.SubCategoryDto;
import com.ecommerce.EcommerceBackend.Model.SubCategory;
import com.ecommerce.EcommerceBackend.Service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/subcategory")
public class SubCategoryController {
    @Autowired
    SubCategoryService subCategoryService;

    @GetMapping("/")
    public List<SubCategory> getAllSubCategories(){
        return  subCategoryService.getAllSubCategories();
    }
    @PostMapping("/in/category/{categoryId}")
    public void addSubCategory(@PathVariable Long categoryId, @RequestBody SubCategoryDto subCategoryDto){
        subCategoryService.addSubCategory(categoryId,subCategoryDto);
    }
//    @PostMapping("/{id}")
//    public void addSubCategory(@PathVariable Long id,@RequestBody ProductDto productDto){
//        subCategoryService.addProductInSubCategory(id,productDto);
//    }

    //    @PutMapping("/{id}")
//    public void updateSubCategory(@PathVariable Long id, @RequestBody UserDto subCategoryDto){
//        subCategoryService.updateUser(id,subCategoryDto);
//    }
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id){
        subCategoryService.deleteSubCategoryById(id);
    }
    @DeleteMapping("/")
    public void deleteAllSubCategory(){
        subCategoryService.deleteAllSubCategory();
    }


}
