//package com.ecommerce.EcommerceBackend.Service;
//
//import com.ecommerce.EcommerceBackend.Dto.ProductAddToCartDto;
//import com.ecommerce.EcommerceBackend.Model.Cart;
//import com.ecommerce.EcommerceBackend.Model.Product;
//import com.ecommerce.EcommerceBackend.Repository.CartRepository;
//import com.ecommerce.EcommerceBackend.Repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//@Service
//public class CartService {
//
////    @Autowired
////    Cart cart;
//
//    @Autowired
//    CartRepository cartRepository;
//
////    public void createCart(){
////        Cart cart = new Cart();
////    }
//    public double calculateTotalBill(List<ProductAddToCartDto> products){
//        double totalBill = 0;
//        for (ProductAddToCartDto item : products) {
//            totalBill+=item.getPrice();
//        }
//        return totalBill;
//    }
//    public void addToCart(ProductAddToCartDto productAddToCartDto) {
////        Product product=productRepository.findAll().stream().filter(x->x.getId()==productAddToCartDto.getProductId()).findAny().get();
//        Cart cart=new Cart();
////        createCart();
//        cart=cartRepository.getCart();
//        cart.getProducts().add(productAddToCartDto);
//        calculateTotalBill(cart.getProducts());
//    }
//}
