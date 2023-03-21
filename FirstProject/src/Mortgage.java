import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        // Establish the scanner I'll be using to take inputs
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for the principal amount and contain it as a long
        System.out.print("Principal: ");
        long principal = scanner.nextLong();
        // Prompt the user for the annual interest rate, and divide it into the monthly interest rate, and divide by 100
        // to make it a percent
        System.out.print("Annual Interest Rate: ");
        float interestRate = scanner.nextFloat() / 1200;
        // Prompt the user for the period of their mortgage, and convert that into months
        System.out.print("Period (years): ");
        int period = scanner.nextInt() * 12;
        // Apply the formula
        double numerator = interestRate * Math.pow((1 + interestRate), period);
        double denom = Math.pow(1 + interestRate, period) - 1;
        double mortgage = principal * (numerator / denom);
        // Convert the output of the formula to the dollar format and print the result
        String mortgageOut = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("Mortgage: " + mortgageOut);
    }
}