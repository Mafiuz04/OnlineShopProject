package entity;

import java.util.Objects;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private int availableAmount;

    public Product(int productId, String productName, double productPrice, int availableAmount) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.availableAmount = availableAmount;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Double.compare(productPrice, product.productPrice) == 0 && availableAmount == product.availableAmount && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, productPrice, availableAmount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", availableAmount=" + availableAmount +
                '}';
    }
}
