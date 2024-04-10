package OnlineShop.entity.Service;

import OnlineShop.entity.Entity.Computer;
import OnlineShop.entity.Entity.Electronics;
import OnlineShop.entity.Entity.Product;
import OnlineShop.entity.Entity.Smartphone;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public interface ProductManager {
    List<Product> products = new ArrayList<>();

    static Product createProduct() {
        Product product = new Product();
        int option = -1;
        System.out.println("What product would you like to add?");
        System.out.println("Option 1 -> Computer");
        System.out.println("Option 2 -> Smartphone");
        System.out.println("Option 3 -> Electronics");
        option = CommandLine.sc.nextInt();
        while (option >= 1 && option <= 3) {
            switch (option) {
                case 1:
                    System.out.println("Please type in below info, computer name:");
                    CommandLine.sc.nextLine();
                    String name = CommandLine.sc.nextLine();
                    System.out.println("Price:");
                    double price = CommandLine.sc.nextDouble();
                    System.out.println("Amount of available products:");
                    int availableAmount = CommandLine.sc.nextInt();
                    CommandLine.sc.nextLine();
                    System.out.println("Processor name:");
                    String processor = CommandLine.sc.nextLine();
                    System.out.println("Amount of RAM memory:");
                    int memoryRAM = CommandLine.sc.nextInt();
                    product = new Computer(name, price, availableAmount, processor, memoryRAM);
                    System.out.println("Computer created and added to the shop");
                    option = 0;
                    break;
                case 2:
                    System.out.println("Please type in below info, smartphone name:");
                    CommandLine.sc.nextLine();
                    String name1 = CommandLine.sc.nextLine();
                    System.out.println("Price:");
                    double price1 = CommandLine.sc.nextDouble();
                    System.out.println("Amount of available products:");
                    int availableAmount1 = CommandLine.sc.nextInt();
                    CommandLine.sc.nextLine();
                    System.out.println("Color:");
                    String color = CommandLine.sc.nextLine();
                    System.out.println("Battery capacity:");
                    int battery = CommandLine.sc.nextInt();
                    product = new Smartphone(name1, price1, availableAmount1, color, battery);
                    System.out.println("Smarphone created and added to the shop");
                    option = 0;
                    break;
                case 3:
                    System.out.println("Please type in below info, electronics name:");
                    CommandLine.sc.nextLine();
                    String name2 = CommandLine.sc.nextLine();
                    System.out.println("Price:");
                    double price2 = CommandLine.sc.nextDouble();
                    System.out.println("Amount of available products:");
                    int availableAmount2 = CommandLine.sc.nextInt();
                    product = new Electronics(name2, price2, availableAmount2);
                    System.out.println(name2 + " created and added to the shop");
                    option = 0;
                    break;
                default:
                    System.out.println("There are no more product categories");
            }
        }
        return product;
    }


    static void addProduct() {
        products.add(createProduct());
    }

    static void showAllProducts() throws NoSuchElementException {
        if (!products.isEmpty()) {
            for (Product product : products) {
                System.out.println("Id = " + (products.lastIndexOf(product) + 1) + ", " + product);
            }
        } else {
            throw new NoSuchElementException("There are no products");
        }
    }
    static void removeNotAvailableProduct() throws  NoSuchElementException{
        if (!products.isEmpty()) {
            products.removeIf(product -> product.getAmountOfAvailableProducts() == 0);
        } else {
            throw new NoSuchElementException("There are no products");
        }
    }

    static void deleteProductByID(int id) {
        products.remove(id - 1);
    }

    static void updateProductById(int id, Product updatedProduct) throws IndexOutOfBoundsException {
        Product product = products.get(id - 1);
        if (product != null) {
            if (product instanceof Computer) {
                System.out.println("Please type in below info, computer name:");
                CommandLine.sc.nextLine();
                String name = CommandLine.sc.nextLine();
                System.out.println("Price:");
                double price = CommandLine.sc.nextDouble();
                System.out.println("Amount of available products:");
                int availableAmount = CommandLine.sc.nextInt();
                CommandLine.sc.nextLine();
                System.out.println("Processor name:");
                String processor = CommandLine.sc.nextLine();
                System.out.println("Amount of RAM memory:");
                int memoryRAM = CommandLine.sc.nextInt();
                updatedProduct = new Computer(name, price, availableAmount, processor, memoryRAM);
                System.out.println("Computer updated");
            } else if (product instanceof Smartphone) {
                System.out.println("Please type in below info, smartphone name:");
                CommandLine.sc.nextLine();
                String name1 = CommandLine.sc.nextLine();
                System.out.println("Price:");
                double price1 = CommandLine.sc.nextDouble();
                System.out.println("Amount of available products:");
                int availableAmount1 = CommandLine.sc.nextInt();
                CommandLine.sc.nextLine();
                System.out.println("Color:");
                String color = CommandLine.sc.nextLine();
                System.out.println("Battery capacity:");
                int battery = CommandLine.sc.nextInt();
                updatedProduct = new Smartphone(name1, price1, availableAmount1, color, battery);
                System.out.println("Smartphone Updated");
            } else if (product instanceof Electronics) {
                System.out.println("Please type in below info, electronics name:");
                CommandLine.sc.nextLine();
                String name2 = CommandLine.sc.nextLine();
                System.out.println("Price:");
                double price2 = CommandLine.sc.nextDouble();
                System.out.println("Amount of available products:");
                int availableAmount2 = CommandLine.sc.nextInt();
                updatedProduct = new Electronics(name2, price2, availableAmount2);
            }
            products.set(id - 1, updatedProduct);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }


}
