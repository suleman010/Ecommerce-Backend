//package com.ecommerce.EcommerceBackend.Model;
//
//import com.ecommerce.EcommerceBackend.Dto.ProductAddToCartDto;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name="cart")
//public class Cart {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "created_date")
//    private Date createdDate;
//
//
//    @ElementCollection
//    @CollectionTable(name = "products")
//    private List<ProductAddToCartDto> products = new ArrayList<>();
//
//    @JsonIgnore
//    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
//    @JoinColumn(nullable = false, name = "user_id")
//    private User user;
//
//    @Column(name = "totalBill")
//    private int totalBill;
//
//}
//
