import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int m = 0;
        boolean validInput = false;
        try {
            n = in.nextInt();
            validInput = true;
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid data entered. Try again");
            in.next();
        }

        if (validInput) {
            try {
                m = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid data entered. Try again");
                in.next();
            }
            int sum = n + m;
            System.out.println("Sum of numbers: " + sum);
        }
    }
}
