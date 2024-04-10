package OnlineShop.entity.Service;

import OnlineShop.entity.Entity.Cart;
import OnlineShop.entity.Entity.Product;

import java.util.NoSuchElementException;


public interface CartService {

    static void addProductToCart(Cart cart, Product product) throws NoSuchElementException, IndexOutOfBoundsException {
        if (!ProductManager.products.isEmpty()) {
            cart.getCartProducts().add(product);
        } else {
            throw new NoSuchElementException("There are no products in the shop.");
        }
    }

    static void showProductsInCart(Cart cart) throws  NoSuchElementException{
        if (!cart.getCartProducts().isEmpty()) {
            for (Product cartProduct : cart.getCartProducts()) {
                System.out.println(cartProduct);
            }
        } else {
            throw new NoSuchElementException("There are no products in the cart");
        }
    }

    static void deleteProductFromCart(Cart cart, int id) {
        cart.getCartProducts().remove(id - 1);
    }
}
