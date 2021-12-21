import java.util.Scanner;
public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalType = scanner.nextLine();

        if ("dog".equals(animalType)){
            System.out.println("mammal");
        }
        else if ("crocodile".equals(animalType) || "tortoise".equals(animalType) || "snake".equals(animalType)){
            System.out.println("reptile");
        }
        else{
            System.out.println("unknown");
        }
    }
}