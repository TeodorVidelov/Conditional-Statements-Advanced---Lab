import java.util.Scanner;
public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (age >= 16 && "m".equals(gender)){
            System.out.println("Mr.");
        }
        else if (age < 16 && "m".equals(gender)){
            System.out.println("Master");
        }
        else if (age >= 16 && "f".equals(gender)){
            System.out.println("Ms.");
        }
        else if (age < 16 && "f".equals(gender)){
            System.out.println("Miss");
        }
    }
}