import java.util.Scanner;
public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        int price = 0;
        if ("Monday".equals(dayOfWeek) || "Tuesday".equals(dayOfWeek) || "Friday".equals(dayOfWeek)){
            price = 12;
        }
        else if ("Wednesday".equals(dayOfWeek) || "Thursday".equals(dayOfWeek)){
            price = 14;
        }
        else if ("Saturday".equals(dayOfWeek) || "Sunday".equals(dayOfWeek)){
            price = 16;
        }
        System.out.println(price);
    }
}