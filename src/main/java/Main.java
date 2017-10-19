

import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("This is Gaussian Wizardry. Please enter a number to receive your sum.");
        int num = scan.nextInt();
        int sum = 0;



        for (int i=1; i <= num; i++) {
            sum += i;
        }
        System.out.println("\nThe sum of your number using Gaussian Wizardry is " + sum + ".");
    }
}
