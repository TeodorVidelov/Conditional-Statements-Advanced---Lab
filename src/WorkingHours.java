import java.util.Scanner;
public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourOfTheDay = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        if (hourOfTheDay >= 10 && hourOfTheDay <= 18){
             if ("Monday".equals(dayOfWeek) || "Tuesday".equals(dayOfWeek) || "Wednesday".equals(dayOfWeek) ||
                 "Thursday".equals(dayOfWeek) || "Friday".equals(dayOfWeek) || "Saturday".equals(dayOfWeek)){
            System.out.println("open");
             }
            else{
            System.out.println("closed");
             }
        }
        else {
            System.out.println("closed");
        }
    }
}