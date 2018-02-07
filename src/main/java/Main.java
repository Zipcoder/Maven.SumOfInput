/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to add to 1: ");

        int userNumber = scan.nextInt() + 1;

        System.out.println("Your total is: " + userNumber);

    }
}
