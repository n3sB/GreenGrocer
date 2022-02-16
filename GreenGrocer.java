import java.util.Scanner;

public class GreenGrocer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double pearKg, pear = 2.14, appleKg, apple = 3.67, tomatoKg, tomato = 1.11, bananaKg, banana = 0.95, eggplantKg, eggplant = 5.00;
        double cost = 0;
 
        System.out.print("How many kilograms of pears ? ");
        pearKg = scanner.nextDouble();
        cost += pearKg*pear;

        System.out.print("How many kilograms of apples ? ");
        appleKg = scanner.nextDouble();
        cost += appleKg*apple;

        System.out.print("How many kilograms of tomatoes ? ");
        tomatoKg = scanner.nextDouble();
        cost += tomatoKg*tomato;

        System.out.print("How many kilograms of banana ? ");
        bananaKg = scanner.nextDouble();
        cost += bananaKg*banana;

        System.out.print("How many kilograms of eggplant ? ");
        eggplantKg = scanner.nextDouble();
        cost += eggplantKg*eggplant;
        scanner.close();

        System.out.println("Total cost: $" + cost);

       
    }
}
