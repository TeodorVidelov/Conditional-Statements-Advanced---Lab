import java.util.Scanner;
public class WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        if ("Monday".equals(dayOfWeek) || "Tuesday".equals(dayOfWeek) || "Wednesday".equals(dayOfWeek) ||
                "Thursday".equals(dayOfWeek) || "Friday".equals(dayOfWeek)){
            System.out.println("Working day");
        }
        else if ("Saturday".equals(dayOfWeek) || "Sunday".equals(dayOfWeek)){
            System.out.println("Weekend");
        }
        else {
            System.out.println("Error");
        }
    }
}