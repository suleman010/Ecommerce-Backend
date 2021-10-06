//package com.ecommerce.EcommerceBackend.Controller;
//
//import com.ecommerce.EcommerceBackend.Dto.ProductAddToCartDto;
//import com.ecommerce.EcommerceBackend.Model.Product;
//import com.ecommerce.EcommerceBackend.Service.CartService;
//import com.ecommerce.EcommerceBackend.Service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@CrossOrigin
//@RequestMapping("/api/cart")
//public class CartController {
//    @Autowired
//    CartService cartService;
//
//
//    @PostMapping("/")
//    public void addToCart(@RequestBody ProductAddToCartDto productAddToCart){
//        cartService.addToCart(productAddToCart);
//    }
//}
