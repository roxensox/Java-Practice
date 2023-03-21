import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MortgageExtended {
    public static void main(String[] args) {
        // Establish the scanner I'll be using to take inputs
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for the principal amount and contain it as a long
        long principal = 0;
        while (true) {
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextLong();
            if (principal < 1000 || principal > 1000000)
                System.out.println("Please enter a number between 1000 and 1000000");
            else
                break;
        }
        // Prompt the user for the annual interest rate, and divide it into the monthly interest rate, and divide by 100
        // to make it a percent
        float interestRate = 0;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            interestRate = scanner.nextFloat() / 1200;
            if (interestRate <= 0 || interestRate * 1200 > 30)
                System.out.println("Please enter a number greater than 0 and less than or equal to 30");
            else
                break;
        }
        // Prompt the user for the period of their mortgage, and convert that into months
        int period = 0;
        while (true) {
            System.out.print("Period (years): ");
            period = scanner.nextInt() * 12;
            if (period < 1 || period / 12 > 30)
                System.out.println("Please enter a value between 1 and 30");
            else
                break;
        }
        // Apply the formula
        double numerator = interestRate * Math.pow((1 + interestRate), period);
        double denom = Math.pow(1 + interestRate, period) - 1;
        double mortgage = principal * (numerator / denom);
        // Convert the output of the formula to the dollar format and print the result
        String mortgageOut = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("Mortgage: " + mortgageOut);
    }
}