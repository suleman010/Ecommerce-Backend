package com.ecommerce.EcommerceBackend.Controller;

import com.ecommerce.EcommerceBackend.Dto.CategoryDto;
import com.ecommerce.EcommerceBackend.Dto.UserDto;
import com.ecommerce.EcommerceBackend.Model.Category;
import com.ecommerce.EcommerceBackend.Model.User;
import com.ecommerce.EcommerceBackend.Repository.CategoryRepository;
import com.ecommerce.EcommerceBackend.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public List<Category> getAllCategories(){
        return  categoryService.getAllCategories();
    }
    @PostMapping("/")
    public void addCategory(@RequestBody CategoryDto categoryDto){
        categoryService.addCategory(categoryDto);
    }
//    @PutMapping("/{id}")
//    public void updateCategory(@PathVariable Long id, @RequestBody UserDto categoryDto){
//        categoryService.updateUser(id,categoryDto);
//    }
//    @PostMapping("/{categoryId}/subcategory/{subCategoryId}")
//    public void addSubcategoryById(@PathVariable Long categoryId,@PathVariable Long subCategoryId){
//        categoryService.addSubCategoryById(subCategoryId,categoryId);
//    }
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id){
        categoryService.deleteCategoryById(id);
    }
    @DeleteMapping("/")
    public void deleteAllCategory(){
        categoryService.deleteAllCategory();
    }


}
