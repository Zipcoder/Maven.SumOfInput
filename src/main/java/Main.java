/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int userNumber = scan.nextInt();

        int total = 0;

        for (int i = 0; i <= userNumber; i++) {
            total += i;
        }

        System.out.println("Your total is: " + total);

    }
}
