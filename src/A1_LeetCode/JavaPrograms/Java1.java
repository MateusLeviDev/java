package A1_LeetCode.JavaPrograms;

import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Years: ");
        int years = scanner.nextInt();
        System.out.print("Months: ");
        int months = scanner.nextInt();
        System.out.print("Days: ");
        int days = scanner.nextInt();

        int days_count = (years * 365) + (months * 30) + days;

        System.out.println("In days: " + days_count);
    }

}
