/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        // opening statement - type any number and the program will add up the values
        System.out.println("Welcome to the Sum of Input Program! Type a number.");

        //let user input a number and store it
        int inputNum = in.nextInt();

        // write a variable that stores the added number
        int sum = 0;

        // a line space
        System.out.println("\n");

        // add the numbers up starting from 1 until aNumber
    for(int run=1; run<=inputNum; run++){
        System.out.println( run + " ");
        sum = sum + run;
    }


        //output Your sum is    .
        System.out.println("The sum is " + sum );
    }
}
