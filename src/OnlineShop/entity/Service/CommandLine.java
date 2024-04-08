package OnlineShop.entity.Service;

import OnlineShop.entity.Entity.Cart;
import OnlineShop.entity.Entity.Customer;
import OnlineShop.entity.Entity.Order;
import OnlineShop.entity.Entity.Product;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.Scanner;

public interface CommandLine {
    Scanner sc = new Scanner(System.in);

    static void openShop() {
        int option = 0;
        while (option == 0) {
            showOpenShopIntro();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    customer(option);
                    option = 0;
                    break;
                case 2:
                    manager(option);
                    option = 0;
                    break;
                case 3:
                    System.out.println("Thank you, see you next time");
                    option = 1;
                    break;
                default:
                    System.out.println("There is no more options, please choose option number 1 or 2.");
            }
        }
    }


    private static void customer(int option) {
        Cart cart = new Cart();
        while (option != 0) {
            System.out.println("Option 1 -> Show available products");
            System.out.println("Option 2 -> Add product to cart");
            System.out.println("Option 3 -> Show products in cart");
            System.out.println("Option 4 -> delete product from cart");
            System.out.println("Option 5 -> create order");
            System.out.println("Option 6 -> exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    try {
                        ProductManager.showAllProducts();
                        System.out.println();
                    } catch (NoSuchElementException e) {
                        System.err.print(e.getMessage());
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Please choose product ID to add it to cart");
                    int add = sc.nextInt();
                    try {
                        CartService.addProductToCart(cart, ProductManager.products.get(add - 1));
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        CartService.showProductsInCart(cart);
                        System.out.println();
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Please choose product ID to delete it from cart");
                    int delete = sc.nextInt();
                    CartService.deleteProductFromCart(cart, delete);
                    break;
                case 5:
                    if (!cart.getCartProducts().isEmpty()) {
                        System.out.println("please insert you name");
                        sc.nextLine();
                        String firstName = sc.nextLine();
                        System.out.println("please insert you sure name");
                        String lastName = sc.nextLine();
                        Order order = new Order(new Customer(firstName, lastName), cart, LocalDateTime.now());
                        OrderProcessor.processOrder(order);
                        option = 0;
                    } else {
                        System.out.println("There are no products in the cart");
                    }
                    break;
                case 6:
                    System.out.println("Thank you for visiting our shop! See you later");
                    option = 0;
                    break;
                default:
                    System.out.println("Please, choose one of above options :) ");
            }
        }
    }

    private static void manager(int option) {
        while (option != 0) {
            System.out.println("Option 1 -> Show available products");
            System.out.println("Option 2 -> Add product to shop");
            System.out.println("Option 3 -> Delete product from shop");
            System.out.println("Option 4 -> Update product from shop");
            System.out.println("Option 5 -> exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    try {
                        ProductManager.showAllProducts();
                        System.out.println();
                    } catch (NoSuchElementException e) {
                        System.err.print(e.getMessage());
                    }
                    System.out.println();
                    break;
                case 2:
                    ProductManager.addProduct();
                    break;
                case 3:
                    System.out.println("Please choose product ID to delete it from shop");
                    int id = sc.nextInt();
                    ProductManager.deleteProductByID(id);
                    break;
                case 4:
                    System.out.println("Please choose product ID to update it");
                    int upId = sc.nextInt();
                    ProductManager.updateProductById(upId, new Product());
                    break;
                case 5:
                    System.out.println("Thank you for visiting our shop! See you later");
                    option = 0;
                    break;
                default:
                    System.out.println("Please, choose one of above options :) ");
                    System.out.println();
            }
        }
    }

    private static void showOpenShopIntro() {
        System.out.println();
        System.out.println("Welcome in our Shop!");
        System.out.println("Nice to see you! How are you? Choose one of below option");
        System.out.println("Option 1 -> Customer");
        System.out.println("Option 2 -> Manager");
        System.out.println("Option 3 -> Exit");
    }

}
