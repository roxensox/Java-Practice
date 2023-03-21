import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] number = {6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}