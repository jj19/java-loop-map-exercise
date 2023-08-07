import java.awt.*;
import java.util.*;

public class CarDealer {
    public static void main(String[] args) {
        HashMap<String, String> cars =  new HashMap<>();
        Scanner customerReq = new Scanner(System.in);

        cars.put("Civic", "Honda");
        cars.put("Corola", "Toyota");
        cars.put("Juke", "Nissan");
        cars.put("Miata", "Mazda");
        cars.put("Mustang", "Ford");

        System.out.println("What kind of car are you looking for today? ");
        String carReq = customerReq.nextLine();

        if(!cars.containsKey(carReq)) {
            System.out.println("We do not have that car...beat it!");
        } else {
            System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...", carReq, cars.get(carReq));
        }
    }
}