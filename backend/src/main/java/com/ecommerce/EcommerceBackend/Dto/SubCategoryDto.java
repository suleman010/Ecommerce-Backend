package com.ecommerce.EcommerceBackend.Dto;

import com.ecommerce.EcommerceBackend.Model.SubCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SubCategoryDto {
    private Long id;
    private String name;
    private String image;
    private Long categoryId;
}
