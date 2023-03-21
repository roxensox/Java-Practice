import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        int temp = 32;
        if (temp > 30) {
            System.out.println("It's hot out");
        } else if (temp > 20) {
            System.out.println("Beautiful day");
        } else {
            System.out.println("It's cold out");
        }

        int income = 120_000;
        boolean hasModerateIncome = (income > 100_000);

        // This is super cool -- you can assign different values to a variable based on a conditional
        // in a single line. This is called the Ternary Operator. This can also be used in some other
        // languages.
        String className = income > 100_000 ? "First" : "Economy";

        // This is less cool, but maybe still useful? Hard to say if it's more efficient than regular if
        // else clauses. Called a switch statement.
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;

            case "moderator":
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guest");
        }
    }
}