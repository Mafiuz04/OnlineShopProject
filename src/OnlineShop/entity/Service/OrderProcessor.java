package OnlineShop.entity.Service;

import OnlineShop.entity.Entity.Order;
import OnlineShop.entity.Entity.Product;

import java.util.List;

public interface OrderProcessor {

  static void processOrder(Order order) {
        generateInvoice(order);
        order.getCart().getCartProducts().clear();
    }


    static void displayOrderDetails(Order order) {
        System.out.println("Order for client: " + order.getCustomer());
        System.out.println();
        System.out.println("Products ordered: ");
        List<Product> products = order.getCart().getCartProducts();
        for (Product product : products) {
            System.out.println("Name: " + product.getProductName() + " ,price : " + product.getProductPrice());
            if(product.getAmountOfAvailableProducts() > 0) {
                product.setAmountOfAvailableProducts(product.getAmountOfAvailableProducts() - 1);
            }
        }
        System.out.println();
        System.out.println("Total price of order : " + order.getCart().getTotalPrice());
        System.out.println();
        System.out.println("Thank you for placing an order");

    }


    static void generateInvoice(Order order) {
      int invoiceNumber = 1;
        System.out.println("Invoice number: " + invoiceNumber + " generated.");
        System.out.println("Date: " + order.getOrderDateTime());
        System.out.println("Order details:");
        displayOrderDetails(order);
        invoiceNumber = invoiceNumber + 1;
    }
}
