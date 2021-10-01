package com.ecommerce.EcommerceBackend.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
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
    @Column(name = "image")
    private List<String> image;
    @Column(name="stock")
    private Long stock;
//    @ManyToOne
//    private Category category;

    /**
     * Empty Constructor. Instantiates a new product.
     * @param name
     * @param description
     * @param price
     * @param stock
     */

    public Product(String name, String description, double price,Long stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String description, double price,Long stock, List<String> image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.stock = stock;
    }
    public Product(){
    }

}
