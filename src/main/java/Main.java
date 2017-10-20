/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //prompt the user for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to print its cumulative sum:");
        int num = input.nextInt();
        System.out.println(Main.sumNumbers(num));

    }

    public static int sumNumbers (int n) {
        int sum = 0;

        for (int i=1; i<=n; i++) {
           sum += i;
        }
        return sum;
    }
}
