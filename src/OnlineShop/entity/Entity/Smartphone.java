package OnlineShop.entity.Entity;

import java.util.List;
import java.util.Objects;

public class Smartphone extends Product {
    private String color;
    private int batteryCapacity;
    private List<Accessories> Accessories;

    public Smartphone(int productId, String productName, double productPrice, int amountOfAvailableProducts, String color, int batteryCapacity, List<Accessories> accessories) {
        super( productName, productPrice, amountOfAvailableProducts);
        this.color = color;
        this.batteryCapacity = batteryCapacity;
        this.Accessories = accessories;
    }

    public Smartphone( String productName, double productPrice, int amountOfAvailableProducts, String color, int batteryCapacity) {
        super( productName, productPrice, amountOfAvailableProducts);
        this.color = color;
        this.batteryCapacity = batteryCapacity;
    }

    public Smartphone(int productId, String productName, double productPrice, int amountOfAvailableProducts) {
        super( productName, productPrice, amountOfAvailableProducts);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public List<Accessories> getAccessories() {
        return Accessories;
    }

    public void setAccessories(List<Accessories> accessories) {
        Accessories = accessories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return batteryCapacity == that.batteryCapacity && Objects.equals(color, that.color) && Objects.equals(Accessories, that.Accessories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, batteryCapacity, Accessories);
    }

    @Override
    public String toString() {
        if(getAccessories() != null) {
            return super.toString() +
                    " color = " + color +
                    ", batteryCapacity = " + batteryCapacity +
                    ", Accessories = " + Accessories;
        } else {
            return super.toString() +
                    " color = " + color +
                    ", batteryCapacity = " + batteryCapacity;
        }
    }
}
