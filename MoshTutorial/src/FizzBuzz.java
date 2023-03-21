import java.io.InputStream;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        long number = scanner.nextLong();
        String fizzbuzz;

        if (number % 5 == 0) {
            fizzbuzz = number % 3 == 0 ? "fizzbuzz" : "fizz";
            System.out.println(fizzbuzz);
        } else if (number % 3 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println(number);
        }
    }
}