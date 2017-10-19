import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        int number;
        int numSum = 0;

        System.out.println("Enter a number:");

        Scanner input = new Scanner(System.in);
        number = input.nextInt();


        for (int i = 0; i <= number; i++) {
            numSum += i;
        }

        System.out.println(numSum);
    }
}