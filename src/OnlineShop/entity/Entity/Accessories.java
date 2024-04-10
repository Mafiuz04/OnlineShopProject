package OnlineShop.entity.Entity;

import java.util.Objects;

public class Accessories {
    private String accessorieName;

    public Accessories(String accessorieName) {
        this.accessorieName = accessorieName;
    }

    public String getAccessorieName() {
        return accessorieName;
    }

    public void setAccessorieName(String accessorieName) {
        this.accessorieName = accessorieName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accessories that = (Accessories) o;
        return Objects.equals(accessorieName, that.accessorieName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessorieName);
    }

    @Override
    public String toString() {
        return "Accessories{" +
                "accessorieName='" + accessorieName + '\'' +
                '}';
    }
}
