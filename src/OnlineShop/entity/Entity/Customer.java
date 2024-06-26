package OnlineShop.entity.Entity;

public class Customer {
    private String firstName;
    private String lastName;
    private boolean isPremium;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(String firstName, String lastName, boolean isPremium) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isPremium = isPremium;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    @Override
    public String toString() {
        return " " +firstName + " " + lastName;
    }
}
