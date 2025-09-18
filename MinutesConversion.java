import java.util.Scanner;

class MinutesConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();
        
        int days = minutes / (60 * 24);
        int years = days / 365;
        int months = (days % 365) / 30;
        int remDays = (days % 365) % 30;
        
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + remDays);

        System.out.println("Aryaveer Sharma 24csu306");
    }
}
