package OnlineShop.entity.Entity;

import java.util.*;

public class Cart {
   private List<Product> cartProducts = new ArrayList<>();

    public Cart() {
    }

    public Cart(List<Product> cartProducts) {
        this.cartProducts = cartProducts;
    }

    public List<Product> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(List<Product> cartProducts) {
        this.cartProducts = cartProducts;
    }
    public double getTotalPrice(){
        double totalPrice = 0;
        for (Product cartProduct : cartProducts) {
            totalPrice += cartProduct.getProductPrice();
        }
        return totalPrice;
    }
    @Override
    public String toString() {
        return cartProducts.toString();

    }
}