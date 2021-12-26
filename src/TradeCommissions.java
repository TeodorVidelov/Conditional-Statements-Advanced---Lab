import java.util.Scanner;
public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double volumeSale = Double.parseDouble(scanner.nextLine());

        double commission = 0;
        boolean isValid = true;
        if (0 <= volumeSale && volumeSale <= 500){
            if ("Sofia".equals(town)){
                commission = volumeSale * 0.05;
            }
            else if ("Varna".equals(town)){
                commission = volumeSale * 0.045;
            }
            else if ("Plovdiv".equals(town)){
                commission = volumeSale * 0.055;
            }
            else {
                isValid = false;
            }
        }
        else if (500 < volumeSale && volumeSale <= 1000){
            if ("Sofia".equals(town)){
                commission = volumeSale * 0.07;
            }
            else if ("Varna".equals(town)){
                commission = volumeSale * 0.075;
            }
            else if ("Plovdiv".equals(town)){
                commission = volumeSale * 0.08;
            }
            else {
                isValid = false;
            }
        }
        else if (1000 < volumeSale && volumeSale <= 10000){
            if ("Sofia".equals(town)){
                commission = volumeSale * 0.08;
            }
            else if ("Varna".equals(town)){
                commission = volumeSale * 0.10;
            }
            else if ("Plovdiv".equals(town)){
                commission = volumeSale * 0.12;
            }
            else {
                isValid = false;
            }
        }
        else if (volumeSale > 10000){
            if ("Sofia".equals(town)){
                commission = volumeSale * 0.12;
            }
            else if ("Varna".equals(town)){
                commission = volumeSale * 0.13;
            }
            else if ("Plovdiv".equals(town)){
                commission = volumeSale * 0.145;
            }
            else {
                isValid = false;
            }
        }
        else {
            isValid = false;
        }
       if (isValid){
           System.out.printf("%.2f",commission);
       }
       else {
           System.out.println("error");
       }
    }
}