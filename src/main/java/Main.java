/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        System.out.println("Enter a number fool");
        int number = in.nextInt();

        int hold = 0;
        for (int x = 0; x <= number; x++){
           hold = hold + x;
        }
            System.out.println("Your sum is: " + hold + " fool!");
        }



    }

