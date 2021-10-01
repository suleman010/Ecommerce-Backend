package com.ecommerce.EcommerceBackend.Dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.List;

@Getter
@Setter
public class ProductDto {
    private String name;
    private String description;
    private double price;
//    private List<String> image;
    private Long stock;
}
