package com.ecommerce.EcommerceBackend.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price", nullable = false)
    private double price;
//    @Column(name = "image")
//    @OneToMany(fetch= FetchType.EAGER, cascade=CascadeType.ALL, mappedBy = "productId")
//    @JsonManagedReference
//    @OneToMany()
    @ElementCollection
    @CollectionTable(name = "images")
    private List<String> images = new ArrayList<>();

    @ManyToOne()
    public SubCategory subCategory;

    @Column(name="stock")
    private Long stock;

}
