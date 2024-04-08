package OnlineShop.entity.Service;

import OnlineShop.entity.Entity.Colors;
import OnlineShop.entity.Entity.Smartphone;

import java.util.NoSuchElementException;
import java.util.Scanner;

public interface SmartphoneService {
    Scanner sc = new Scanner(System.in);
    static void chooseColor(Smartphone smartphone, String color) throws NoSuchElementException{
        System.out.println("Do wyboru masz jeden z poniższych kolorów, proszę wybierz jeden");
        for (Colors value : Colors.values()) {
            System.out.println(value);
        }
       color = sc.nextLine();
        if(!color.equals(Colors.values()))
            throw new NoSuchElementException();
        smartphone.setColor(color);
    }

}
