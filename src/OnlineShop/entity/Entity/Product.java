package OnlineShop.entity.Entity;

import java.lang.String;
import java.util.Objects;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private int amountOfAvailableProducts;

    public Product() {
    }

    public Product(java.lang.String productName, double productPrice, int amountOfAvailableProducts) {

        this.productName = productName;
        this.productPrice = productPrice;
        this.amountOfAvailableProducts = amountOfAvailableProducts;
    }


    public java.lang.String getProductName() {
        return productName;
    }

    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getAmountOfAvailableProducts() {
        return amountOfAvailableProducts;
    }

    public void setAmountOfAvailableProducts(int amountOfAvailableProducts) {
        this.amountOfAvailableProducts = amountOfAvailableProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(productPrice, product.productPrice) == 0 && amountOfAvailableProducts == product.amountOfAvailableProducts && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice, amountOfAvailableProducts);
    }

    @Override
    public String toString() {
        return
                "Name = " + productName +
                        ", Price = " + productPrice +
                        ", amount of available products = " + amountOfAvailableProducts;
    }
}
