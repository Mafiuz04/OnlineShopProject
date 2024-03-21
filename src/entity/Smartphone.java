package entity;

import java.util.List;

public class Smartphone extends Product{
    private String color;
    private int batteryCapacity;
    private List<Accessory> Accessories;

    public Smartphone(int productId, String productName, double productPrice, int amountOfAvailableProducts) {
        super(productId, productName, productPrice, amountOfAvailableProducts);
    }
}
