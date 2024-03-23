package OnlineShop.entity.service;

import java.util.Scanner;

public interface CommandLine {
    Scanner sc = new Scanner(System.in);

    private void openShop() {
        System.out.println("Welcome in our Shop!");
        System.out.println("Below you can see our shop menu, please choose one option");
        System.out.println("Option 1 -> Show all available products");
        System.out.println("Option 2 -> Choose product category");
        System.out.println("Option 3 -> Show my cart");
        System.out.println("Option 4 -> Exit Shop");
        System.out.println("Option 5 -> Create account");
        System.out.println("Option 6 -> Log in to the account");
        System.out.println("Option 7 -> ");
        System.out.println("Option 8 -> ");
        System.out.println("Option 9 -> ");
        System.out.println("Option 10 -> ");
        int option = -1;
        option = sc.nextInt();

        while (option > 0 && option < 7) {
            switch (option) {
                case 1:
                    showAllAvailableProducts();
                    break;
                case 2:
                    chooseProductCategory();
                    break;
                case 3:
                    showCart();
                    break;
                case 4:
                    createAccount();
                    break;
                case 5:
                    logInTotheAccount();
                    break;
                case 0:
                    exitShop();
                    break;
                    System.out.println("Thank you for visiting our shop! See you later");
                default:
                    System.out.println("Please, choose one of above options :) ");
            }
        }

    }
}
