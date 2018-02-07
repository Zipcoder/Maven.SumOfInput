/**
 * Created by iyasuwatts on 10/17/17.
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int n;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Please enter a whole number greater than zero: ");
            String inputString = scanner.next();
            try {
                n = Integer.parseInt(inputString);
                //System.out.println("Correct int");
                if (n <= 0) continue;
                else break;
            } catch (NumberFormatException ne) {
                System.out.println("Input is not a whole number greater than zero.");
                System.out.println("Please try again.");
            }
        } while (true);

        int sum = 0;

        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum is: " + sum);
        }
        else System.out.println("Sum is: " + n);

    }
}
