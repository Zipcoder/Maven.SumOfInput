import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static int sumOfInput(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a numer you would like the summation of: ");
        int input = in.nextInt();

        System.out.println("The summation of 1 to " + input + " is " + sumOfInput(input));

    }
}
