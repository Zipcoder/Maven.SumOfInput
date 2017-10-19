import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive number.");
        int input = scanner.nextInt();
        while (input < 1) {
            System.out.println("Invalid input. Enter any positive number.");
            input = scanner.nextInt();
        }
        int sumOfNumbers = 0;

        for (int i = 1; i <= input; i++) {
            sumOfNumbers += i;
        }

        System.out.println(sumOfNumbers);


    }
}
