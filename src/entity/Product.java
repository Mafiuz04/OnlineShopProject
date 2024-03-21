package entity;

import java.lang.String;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private int amountOfAvailableProducts;

    public Product(int productId, java.lang.String productName, double productPrice, int amountOfAvailableProducts) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.amountOfAvailableProducts = amountOfAvailableProducts;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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
}
