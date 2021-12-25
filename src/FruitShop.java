import java.util.Scanner;
public class FruitShop  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if ("Monday".equals(dayOfWeek) || "Tuesday".equals(dayOfWeek) || "Wednesday".equals(dayOfWeek) ||
        "Thursday".equals(dayOfWeek) || "Friday".equals(dayOfWeek)){
            if ("banana".equals(typeFruit)){
                price = 2.50;
            }
            else if ("apple".equals(typeFruit)) {
                price = 1.20;
            }
            else if ("orange".equals(typeFruit)){
                price = 0.85;
            }
            else if ("grapefruit".equals(typeFruit)){
                price = 1.45;
            }
            else if ("kiwi".equals(typeFruit)){
                price = 2.70;
            }
            else if ("pineapple".equals(typeFruit)){
                price = 5.50;
            }
            else if ("grapes".equals(typeFruit)){
                price = 3.85;
            }
        }
        else if ("Saturday".equals(dayOfWeek) || "Sunday".equals(dayOfWeek)){
            if ("banana".equals(typeFruit)){
                price = 2.70;
            }
            else if ("apple".equals(typeFruit)) {
                price = 1.25;
            }
            else if ("orange".equals(typeFruit)){
                price = 0.90;
            }
            else if ("grapefruit".equals(typeFruit)){
                price = 1.60;
            }
            else if ("kiwi".equals(typeFruit)){
                price = 3.00;
            }
            else if ("pineapple".equals(typeFruit)){
                price = 5.60;
            }
            else if ("grapes".equals(typeFruit)){
                price = 4.20;
            }
        }
        if (price > 0){
            System.out.printf("%.2f",price * quantity);
        }
        else {
            System.out.println("error");
        }
    }
}